package com.charge.link.vehicle.ChargeLink.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.charge.link.vehicle.ChargeLink.dto.VehicleDTO;
import com.charge.link.vehicle.ChargeLink.service.VehicleServiceImpl;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {
	@Autowired
	VehicleServiceImpl vehicleServiceImpl;

	@PostMapping("/save")
	public String saveVehicleDetails(@RequestBody VehicleDTO vehicleDto) {
		System.out.println(vehicleDto.toString());
		String message = vehicleServiceImpl.createVehicle(vehicleDto);
		return message;

	}

	@GetMapping("/all")
	public List<VehicleDTO> getAllVechilesDetails() {
		List<VehicleDTO> vehicles = vehicleServiceImpl.getAllVehicles();
		return vehicles;
	}

	@GetMapping("/getDetails/{model}")
	public List<VehicleDTO> getDetailsByModel(@PathVariable String model) {
		List<VehicleDTO> vehicleList = vehicleServiceImpl.getDetailsByModel(model);
		return vehicleList;
	}
	
	@DeleteMapping("/remove")
	public String removeVehicle(@RequestParam("VehicleNo") String VehicleNo) {
		String message = vehicleServiceImpl.deleteVehicle(VehicleNo);
		return message;
	}
}
