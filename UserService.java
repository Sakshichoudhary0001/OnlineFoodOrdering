package sak.com.service;

import java.util.List;

import sak.com.model.User;

public interface UserService {
	static User createCustomer(User customer) {
		// TODO Auto-generated method stub
		return null;
	}
	List<User> getAllCustomers();
	User getCustomer(int id);
	User updateCustomer(int id,User customer);
	String deleteCustomer(int id);
	static User getUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
	static String deleteUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
