package com.charge.link.vehicle.ChargeLink.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.charge.link.vehicle.ChargeLink.dto.VehicleDTO;
import com.charge.link.vehicle.ChargeLink.entity.Vehicle;
import com.charge.link.vehicle.ChargeLink.repository.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	VehicleRepository vehicleRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public String createVehicle(VehicleDTO vehicleDto) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Vehicle();
		vehicle = modelMapper.map(vehicleDto, Vehicle.class);
		vehicleRepository.save(vehicle);
		return "Vehicle Details entered succesfully.";
	}

	@Override
	public List<VehicleDTO> getAllVehicles() {
		List<Vehicle> vehicles = vehicleRepository.findAll();		List<VehicleDTO> dtoList = vehicles.stream().map(vehicle -> modelMapper.map(vehicle, VehicleDTO.class)).collect(Collectors.toList());
		return dtoList;
	}

	@Override
	public List<VehicleDTO> getDetailsByModel(String model) {
		// TODO Auto-generated method stub
		List<Vehicle> vehicles = vehicleRepository.findByModel(model);
		List<VehicleDTO> dtoList = vehicles.stream().map(vehicle -> modelMapper.map(vehicle, VehicleDTO.class)).collect(Collectors.toList());
		return dtoList;
	}

	@Override
	public String deleteVehicle(String vehicleNo) {
	   vehicleRepository.deleteById(vehicleNo);
		
		return "vehicle removed successfully";
	}

}
