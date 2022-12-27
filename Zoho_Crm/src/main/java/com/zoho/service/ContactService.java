package com.zoho.service;

import java.util.List;

import com.zoho.entity.Contact;

public interface ContactService {
	public void saveContact(Contact contact);

	public List<Contact> getAllContacts();

	public Contact getContactById(long id); 
	
}
