package com.charge.link.vehicle.ChargeLink.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.charge.link.vehicle.ChargeLink.entity.Customer;
import com.charge.link.vehicle.ChargeLink.entity.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, String> {
	
	List<Vehicle> findByModel(String model);
	
	
}
