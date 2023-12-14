package com.example.hotelmanagemenet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hotelmanagemenet.model.Customer;
import com.example.hotelmanagemenet.repository.HotelManagementRepository;

@Service
public class HoteManagementServiceImpl implements HotelManagementService{
 @Autowired
 private HotelManagementRepository hotelrepo;
	@Override
	public List<Customer> showCustomerDetails() {
		
		return hotelrepo.findAll();
	}
	@Override
	public Optional<Customer> searchCustomer(int id) {
	
		return hotelrepo.findById(id);
	}
	@Override
	public Customer addCustomerdetails(Customer customer) {
	
		return hotelrepo.save(customer);
	}
	@Override
	public void deleteCustomerDetails(int id) {
	     hotelrepo.deleteById(id);
		
	}

}
