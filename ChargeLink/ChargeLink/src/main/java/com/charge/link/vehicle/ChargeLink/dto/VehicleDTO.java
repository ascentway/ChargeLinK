package com.charge.link.vehicle.ChargeLink.dto;

import java.util.List;

public class VehicleDTO {

	private String VehicleNo;
	private String model;
	private String type;
	private String brand;
	private String chargerType;

	public VehicleDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getVehicleNo() {
		return VehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		VehicleNo = vehicleNo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getChargerType() {
		return chargerType;
	}

	public void setChargerType(String chargerType) {
		this.chargerType = chargerType;
	}

	@Override
	public String toString() {
		return "VehicleDTO [vid=" + VehicleNo + ", model=" + model + ", type=" + type + ", brand=" + brand + ", chargerType="
				+ chargerType + "]";
	}

}
