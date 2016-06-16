package org.axissolutions.services;

import java.util.List;

import org.axissolutions.domain.User;

public interface DbAbstractFactory {

	public List<User> getDriver(List<String> threshold);

	public void saveTransaction(User user, double fare);

}
