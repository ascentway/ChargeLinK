package com.charge.link.vehicle.ChargeLink.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.charge.link.vehicle.ChargeLink.dto.CustomerDTO;
import com.charge.link.vehicle.ChargeLink.entity.Customer;
import com.charge.link.vehicle.ChargeLink.repository.CustomerRepository;

//Jiske upar bhi serivce likha hai vo service class hai
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public String createCustomer(CustomerDTO customerDto) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setCustomerName(customerDto.getCustomerName());
		customer.setEmailId(customerDto.getEmailId());
		customer.setAddress(customerDto.getAddress());
		customer.setMobileNumber(customerDto.getMobileNumber());
		customer.setUsername(customerDto.getUsername());
		customer.setPassword(customerDto.getPassword());
		customer.setDateofbirth(customerDto.getDateofbirth());
		customerRepository.save(customer);
		return "Registered Succesfully";
	}
	

	@Override
	public List<CustomerDTO> getCustomer() {
		// TODO Auto-generated method stub
		List<Customer> customers = customerRepository.findAll();
		System.out.println(customers.toString());
		List<CustomerDTO> allCusts = customers.stream().map(customer -> modelMapper.map(customer, CustomerDTO.class))
				.collect(Collectors.toList());
		return allCusts;
	}

	@Override
	public CustomerDTO updateCustomer(CustomerDTO customerDto, int customerId) {
		// TODO Auto-generated method stub
		Customer customer = customerRepository.findById(customerId);
		customer.setAddress(customerDto.getAddress());
		customer.setMobileNumber(customerDto.getMobileNumber());
		CustomerDTO updateCustomer = modelMapper.map(customer, CustomerDTO.class);
		return updateCustomer ;
	}
	
	@Override
	public String deleteCustoemr(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}


}
