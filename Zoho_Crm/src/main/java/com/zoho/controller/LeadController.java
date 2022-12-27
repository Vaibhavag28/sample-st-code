package com.zoho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho.entity.Contact;
import com.zoho.entity.Lead;
import com.zoho.service.ContactService;
import com.zoho.service.LeadService;

@Controller

public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/createLead")
	public String viewCreateLeadForm() {
		return "create_Lead";
		
	}
	
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute("lead") Lead lead,Model model) {
		leadService.saveOneLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
		
	}
	
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id, Model model) {
		Lead byId = leadService.getById(id);
		
		Contact contact=new Contact();
		contact.setFirstName(byId.getFirstName());
		contact.setLastName(byId.getLastName());
		contact.setEmail(byId.getEmail());
		contact.setMobile(byId.getMobile());
		contact.setSource(byId.getSource());
		contactService.saveContact(contact);
		
		leadService.deleteById(id);
		
		List<Contact> allContacts = contactService.getAllContacts();
		model.addAttribute("allContacts", allContacts);
		return "list_contact";
	}
	
	@RequestMapping("/listLeads")
	public String listLeads(Model model) {
		List<Lead> allLeads = leadService.getAllLeads();
		model.addAttribute("allLeads", allLeads);
		return "list_leads";
	}
	
	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam("id") long id, Model model) {
		Lead lead = leadService.getById(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
}