package com.charge.link.vehicle.ChargeLink.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.charge.link.vehicle.ChargeLink.dto.CustomerDTO;
import com.charge.link.vehicle.ChargeLink.service.CustomerService;
import com.charge.link.vehicle.ChargeLink.service.CustomerServiceImpl;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerServiceImpl customerServiceImpl;

	@GetMapping("/all")
	public List<CustomerDTO> getAllCustomers() {
		List<CustomerDTO> customers = customerServiceImpl.getCustomer();
		return customers;
	}
	
	@PostMapping("/save")
	public String savecustomer(@RequestBody CustomerDTO customerDto) {
		String message= customerServiceImpl.createCustomer(customerDto);
		return message;    
	}
	
	@PutMapping("/update/{customerId}")
	public CustomerDTO updatecustomer(@PathVariable int customerId , @RequestBody CustomerDTO customerDto) {
		return customerServiceImpl.updateCustomer(customerDto, customerId);
	} 
	
}
