package com.charge.link.vehicle.ChargeLink.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.charge.link.vehicle.ChargeLink.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{
	Customer findById(int customerId);
}
