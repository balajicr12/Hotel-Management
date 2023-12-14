package com.example.hotelmanagemenet.service;

import java.util.List;
import java.util.Optional;

import com.example.hotelmanagemenet.model.Customer;

public interface HotelManagementService {
	List<Customer> showCustomerDetails();
	
	Optional<Customer> searchCustomer(int id);
	
	Customer addCustomerdetails(Customer customer);
   
	void deleteCustomerDetails(int id);
}
