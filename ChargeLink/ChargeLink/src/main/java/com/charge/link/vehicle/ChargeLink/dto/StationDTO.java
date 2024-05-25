package com.charge.link.vehicle.ChargeLink.dto;

public class StationDTO {
	
	private int stationNo;
	private String location;
	private String chargerType;
	private int noOfSlots;
	private String slotStatus;
	private String supplyType;
	private String outputPower;
	private String rate;
	
	public StationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StationDTO(int stationNo, String location, String chargerType, int noOfSlots, String slotStatus,
			String supplyType, String outputPower, String rate) {
		super();
		this.stationNo = stationNo;
		this.location = location;
		this.chargerType = chargerType;
		this.noOfSlots = noOfSlots;
		this.slotStatus = slotStatus;
		this.supplyType = supplyType;
		this.outputPower = outputPower;
		this.rate = rate;
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
	@Override
	public String toString() {
		return "StationDTO [stationNo=" + stationNo + ", location=" + location + ", chargerType=" + chargerType
				+ ", noOfSlots=" + noOfSlots + ", slotStatus=" + slotStatus + ", supplyType=" + supplyType
				+ ", outputPower=" + outputPower + ", rate=" + rate + "]";
	}
	
	
}
