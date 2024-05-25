package com.charge.link.vehicle.ChargeLink.service;

import java.util.List;

import com.charge.link.vehicle.ChargeLink.dto.CustomerDTO;
import com.charge.link.vehicle.ChargeLink.dto.VehicleDTO;

public interface VehicleService {
	
	public String createVehicle(VehicleDTO vehicleDto);
	public List<VehicleDTO> getAllVehicles();
	public List<VehicleDTO> getDetailsByModel(String model);
	public String deleteVehicle(String vehicleNo);
}
