package com.charge.link.vehicle.ChargeLink.service;

import java.util.List;

import com.charge.link.vehicle.ChargeLink.dto.CustomerDTO;
import com.charge.link.vehicle.ChargeLink.entity.Customer;

public interface CustomerService {
	public String createCustomer(CustomerDTO customerDto);

	public List<CustomerDTO> getCustomer();

	public CustomerDTO updateCustomer(CustomerDTO customerDto, int customerId);

	public String deleteCustoemr(Customer customer);
}
