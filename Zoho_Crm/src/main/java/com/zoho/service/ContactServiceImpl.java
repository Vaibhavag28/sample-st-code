package com.zoho.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.entity.Contact;
import com.zoho.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	
	@Autowired
	private ContactRepository contactRepo;
	@Override
	public void saveContact(Contact contact) {
		contactRepo.save(contact);
	}
	@Override
	public List<Contact> getAllContacts() {
		List<Contact> findall = contactRepo.findAll();
		return findall;
	}
	@Override
	public Contact getContactById(long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		Contact contact = findById.get();
		return contact;
	}

}
