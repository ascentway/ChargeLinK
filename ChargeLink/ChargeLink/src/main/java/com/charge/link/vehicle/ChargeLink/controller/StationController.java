package com.charge.link.vehicle.ChargeLink.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.charge.link.vehicle.ChargeLink.dto.StationDTO;
import com.charge.link.vehicle.ChargeLink.service.StationServiceImpl;

@RestController
@RequestMapping("/stations")
public class StationController {
	@Autowired
	StationServiceImpl stationServiceImpl;

	@PostMapping("/save")
	public String saveStationDetails(@RequestBody StationDTO stationDto) {
		System.out.println(stationDto.toString());
		String message = stationServiceImpl.createStation(stationDto);
		return message;
	}
	
	@GetMapping("/all")
	public List<StationDTO> getAllStationDetails(){
		List<StationDTO> stations = stationServiceImpl.getAllStations();
		return stations;
		
	}

	@GetMapping("/getDetails")
	public List<StationDTO> getDetailsByStationLocation(@RequestParam("location") String location){
		List<StationDTO> stationList= stationServiceImpl.getDetailsByLocation(location);
		return stationList;
		
	}
	
	@PutMapping("/update/{stationNo}")
	public StationDTO updatestation(@PathVariable int stationNo , @RequestBody StationDTO stationDto ) {
		return stationServiceImpl.updateStation(stationDto, stationNo);
	}
	
	@DeleteMapping("/removeStation")
	public String removeStation(@RequestParam("StationNo") int StationNo) {
		String message = stationServiceImpl.deleteStation(StationNo);
		return message;
	}
	
	
}

