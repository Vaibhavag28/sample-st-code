package com.zoho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoho.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
