package com.zoho.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.entity.Lead;
import com.zoho.repository.LeadRepository;

import antlr.collections.List;

@Service

public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadRepository leadRepo;
	
	@Override
	public void saveOneLead(Lead lead) {
		leadRepo.save(lead);
		
	}

	@Override
	public Lead getById(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead=findById.get();
		return lead;
	}

	@Override
	public void deleteById(long id) {
		leadRepo.deleteById(id);
	}

	@Override
	public java.util.List<Lead> getAllLeads() {
		java.util.List<Lead> findAll = leadRepo.findAll();
		return findAll;
	}

	
}
