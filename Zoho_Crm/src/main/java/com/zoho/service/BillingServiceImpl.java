package com.zoho.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.entity.Billing;
import com.zoho.repository.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	private BillingRepository billingrepo;
	
	@Override
	public void generateBill(Billing bill) {
		billingrepo.save(bill);
	}

	@Override
	public List<Billing> getAllBills() {
		List<Billing> findall = billingrepo.findAll();
		return findall;
	}

}
