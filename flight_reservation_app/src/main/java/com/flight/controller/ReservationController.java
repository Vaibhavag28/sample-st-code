package com.flight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flight.dto.ReservationRequest;
import com.flight.entity.Reservation;
import com.flight.service.ResevationService;
//import com.flight.utilities.PDFGenerator;

@Controller
public class ReservationController {
	@Autowired
	private ResevationService resevationService;
	
	@RequestMapping("/confirmReservation")
	public String confirmReservation(ReservationRequest request, ModelMap model) {
		Reservation reservationId = resevationService.bookFlight(request);
		model.addAttribute("reservationId", reservationId.getId());

;		return "confirmReservation";
		
		
	}
}
