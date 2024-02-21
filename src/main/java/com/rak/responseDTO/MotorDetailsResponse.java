package com.rak.responseDTO;

import java.util.List;

import com.rak.model.InsuranceDetails;

import lombok.Data;

@Data
public class MotorDetailsResponse {
	
	private String customerType;
	private String vehicleGccSpesification;
	private String typeOfVehicle;
	private String coverageType;
	private String purposeOfTransaction;
	private String vin;
	private String modelYear;
	private String make;
	private String vehicleModel;
	private String category;
	private String bodyType;
	private String engine;
	private String transmission;
	private Integer cylinder;
	private Integer noOfseats;
	private String manufacturedCountry;
	private String cityOfRegistration;
	private Integer noClaimDiscount;
	private String vehilcleRepair;
	private Integer sumInsured;
	private String nationality;
	private String ownersDateOfBirth;
	private String drivingLicenceIssueDate;
	private Integer driverAge;
	private List<InsuranceDetails> insuranceDetails;

}
