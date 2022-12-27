package com.zoho.service;

import java.util.List;

import com.zoho.entity.Lead;



public interface LeadService {

	public void saveOneLead(Lead lead);
	public Lead getById(long id);
	public void deleteById(long id);
	public List<Lead> getAllLeads();
	
}