package com.zoho.service;

import java.util.List;

import com.zoho.entity.Billing;

public interface BillingService {
	public void generateBill(Billing bill);

	public List<Billing> getAllBills();
}
