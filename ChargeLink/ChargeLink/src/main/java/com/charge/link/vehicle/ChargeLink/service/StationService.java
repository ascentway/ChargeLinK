package com.charge.link.vehicle.ChargeLink.service;

import java.util.List;

import com.charge.link.vehicle.ChargeLink.dto.StationDTO;

public interface StationService {
	
	public String createStation(StationDTO stationDto);
	public List<StationDTO> getAllStations();
	public List<StationDTO> getDetailsByLocation(String location);
	public StationDTO updateStation(StationDTO stationDto, int stationNo);
	public String deleteStation(int stationNo);
}
