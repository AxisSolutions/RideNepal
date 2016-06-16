package org.axissolutions.services;

import org.axissolutions.domain.User;

public interface PaymentHandler {

	public boolean processPayment(String amount, User driver, User rider);
	
}
