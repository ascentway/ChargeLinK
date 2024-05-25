package com.charge.link.vehicle.ChargeLink.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.charge.link.vehicle.ChargeLink.entity.Station;

@Repository
public interface StationRepository extends JpaRepository<Station, Integer> {

	List<Station> findByLocation(String location);
	Station findByStationNo(int stationNo);
}
