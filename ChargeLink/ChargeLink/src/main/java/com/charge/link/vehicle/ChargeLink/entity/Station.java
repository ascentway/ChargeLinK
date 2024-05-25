package com.charge.link.vehicle.ChargeLink.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "station")
public class Station {

	@Id
	private int stationNo;
	private String location;
	private String chargerType;
	private int noOfSlots;
	private String slotStatus;
	private String supplyType;
	private String outputPower;
	private String rate;
	public Station() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Station [stationNo=" + stationNo + ", location=" + location + ", chargerType=" + chargerType
				+ ", noOfSlots=" + noOfSlots + ", slotStatus=" + slotStatus + ", supplyType=" + supplyType
				+ ", outputPower=" + outputPower + ", rate=" + rate + "]";
	}
	public int getStationNo() {
		return stationNo;
	}
	public void setStationNo(int stationNo) {
		this.stationNo = stationNo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getChargerType() {
		return chargerType;
	}
	public void setChargerType(String chargerType) {
		this.chargerType = chargerType;
	}
	public int getNoOfSlots() {
		return noOfSlots;
	}
	public void setNoOfSlots(int noOfSlots) {
		this.noOfSlots = noOfSlots;
	}
	public String getSlotStatus() {
		return slotStatus;
	}
	public void setSlotStatus(String slotStatus) {
		this.slotStatus = slotStatus;
	}
	public String getSupplyType() {
		return supplyType;
	}
	public void setSupplyType(String supplyType) {
		this.supplyType = supplyType;
	}
	public String getOutputPower() {
		return outputPower;
	}
	public void setOutputPower(String outputPower) {
		this.outputPower = outputPower;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	

}

