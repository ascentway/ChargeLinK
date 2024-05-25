package com.charge.link.vehicle.ChargeLink.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.charge.link.vehicle.ChargeLink.dto.CustomerDTO;
import com.charge.link.vehicle.ChargeLink.dto.StationDTO;
import com.charge.link.vehicle.ChargeLink.entity.Customer;
import com.charge.link.vehicle.ChargeLink.entity.Station;
import com.charge.link.vehicle.ChargeLink.entity.Vehicle;
import com.charge.link.vehicle.ChargeLink.repository.StationRepository;

@Service
public class StationServiceImpl implements StationService {

	@Autowired
	StationRepository stationRepository;
	@Autowired
	private ModelMapper modelMapper;
	public String createStation(StationDTO stationDto) {
		// TODO Auto-generated method stub
		Station station = new Station();
		station = modelMapper.map(stationDto, Station.class);
		
		return "Station Details Fetched Successfully";
	}
	@Override
	public List<StationDTO> getAllStations() {
		List<Station> stations = stationRepository.findAll();
		System.out.println(stations.toString());
		List<StationDTO> stationList= stations.stream().map(s -> modelMapper.map(s, StationDTO.class)).collect(Collectors.toList());
		return stationList;
	}
	@Override
	public List<StationDTO> getDetailsByLocation(String location) {
		List<Station> stations = stationRepository.findByLocation(location);
		List<StationDTO> dtoList = stations.stream().map(station -> modelMapper.map(station, StationDTO.class)).collect(Collectors.toList());
		return dtoList;
	}
	
	@Override
	public StationDTO updateStation (StationDTO stationDto, int stationNo ){
		Station station = stationRepository.findByStationNo(stationNo);
		station.setRate(stationDto.getRate());
		StationDTO updatestation = modelMapper.map(station, StationDTO.class);
		return updatestation ;

	}
	@Override
	public String deleteStation(int stationNo) {
		// TODO Auto-generated method stub
		stationRepository.deleteById(stationNo);
		return "Station removed successfully";
	}

}
