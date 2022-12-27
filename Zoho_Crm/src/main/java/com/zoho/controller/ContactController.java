package com.zoho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho.entity.Billing;
import com.zoho.entity.Contact;
import com.zoho.service.BillingService;
import com.zoho.service.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/listcontact")
	public String listcontact(Model model) {
		List<Contact> allContacts = contactService.getAllContacts();
		model.addAttribute("allContacts", allContacts);
		return "list_contact";
	}
	
	@RequestMapping("/createBill")
	public String createBill(@RequestParam("id") long id,Model model) {
		Contact contactById = contactService.getContactById(id);
		model.addAttribute("contactById", contactById);
		return"generate_bill";
	}
	
//	@RequestMapping("/listbills")
//	public String listbills(Model model) {
//		List<Billing> allbills = billingService.getAllBills();
//		model.addAttribute("allbills", allbills);
//		return "list_bills";
//	}
	
	@RequestMapping("/saveBill")
	public String saveBill(Billing bill, Model model) {
		billingService.generateBill(bill);
		
		List<Billing> allbills = billingService.getAllBills();
		model.addAttribute("allbills", allbills);
		return "list_bills";
	}
	
	
}
