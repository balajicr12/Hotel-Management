package com.example.hotelmanagemenet.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.hotelmanagemenet.model.Customer;
import com.example.hotelmanagemenet.service.HotelManagementService;

@Controller
public class HomeController {
	@Autowired
	private HotelManagementService hotelService;
	
	@GetMapping("/view")
	public String viewpage(Model model) {
		model.addAttribute("customerDetails",hotelService.showCustomerDetails());
		return "view";
	}
	@GetMapping("/add")
	public String addPage(Model model)
	{
		model.addAttribute("obj",new Customer());
		return "add";
	}
 @PostMapping("/add")
 public String addData(@ModelAttribute("obj")Customer customer)
 {
	Optional<Customer> opt=hotelService.searchCustomer(customer.getRoomId());
	if(opt.isEmpty())
	{
		hotelService.addCustomerdetails(customer);
		return "redirect:/view";
	}
	else
	{
		return "redirect:/add?failed";
	}
 }
   @GetMapping("/edit/{id}")
   public String editpage(@PathVariable("id")int room_id,Model model)
   {
	   model.addAttribute("obj",hotelService.searchCustomer(room_id));
	   return "edit";
	   
   }
   @PostMapping("/edit")
   public String editCustomerDetails(@ModelAttribute("obj")Customer customer)
   {
	   hotelService.addCustomerdetails(customer);
	   return "redirect:/view";
   }
   @GetMapping("/delete/{id}")
   public String deleteCustomerDetails(@PathVariable("id") int roomId)
   {
	   hotelService.deleteCustomerDetails(roomId);
	   return "redirect:/view";
   }
}
