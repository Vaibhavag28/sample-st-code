package com.flight.service;

import com.flight.dto.ReservationRequest;
import com.flight.entity.Reservation;

public interface ResevationService {
	Reservation bookFlight(ReservationRequest request);
}
