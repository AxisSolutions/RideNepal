package org.axissolutions.services;

import java.util.List;

import org.axissolutions.domain.User;

public interface GpsTracker {
	
	public double getDistance(String origin, String Destination);

	public List<User> getDrivers(String address, String distance);
}
