package com.example.hotelmanagemenet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hotelmanagemenet.model.Customer;

public interface HotelManagementRepository extends JpaRepository<Customer,Integer>{

}
