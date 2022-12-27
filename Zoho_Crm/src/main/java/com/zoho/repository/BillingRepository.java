package com.zoho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoho.entity.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
