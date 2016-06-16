package org.axissolutions.services;

import org.axissolutions.domain.User;

public interface EmailService {

	public void sendInvoice(User user, double fare);
	
}
