package com.rak.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rak.feignClients.MotorClient;
import com.rak.model.InsuranceDetails;
import com.rak.responseDTO.MotorDetailsResponse;
import com.rak.responseDTO.ResponseMap;
import com.rak.service.MotorService;

@Service
public class MotorServiceImpl implements MotorService {

	@Autowired
	MotorClient motorClient;

	@Override
	public List<ResponseMap> getMotorBrand() throws Exception {

		List<ResponseMap> response = new ArrayList<>();
		List<String> br = Arrays.asList("Benz", "Citroen", "Jeep", "Honda", "Kia", "Land Rover", "volvo");
		for (String brand : br) {
			ResponseMap map = new ResponseMap();
			map.setKey(brand);
			map.setValue(brand);
			response.add(map);
		}
		return response;
	}

	@Override
	public List<ResponseMap> getMotorModel(String brand) throws Exception {
		List<ResponseMap> response = new ArrayList<>();
		List<String> mo = Arrays.asList("Civic", "Elevate", "Amaze", "City", "Jazz");
		for (String model : mo) {
			ResponseMap map = new ResponseMap();
			map.setKey(model);
			map.setValue(model);
			response.add(map);
		}
		return response;
	}

	@Override
	public List<ResponseMap> getMotorVariant(String brand, String model) throws Exception {
		List<ResponseMap> response = new ArrayList<>();
		List<String> va = Arrays.asList("2.0 L Diesel", "1.5 L Petrol");
		for (String variant : va) {
			ResponseMap map = new ResponseMap();
			map.setKey(variant);
			map.setValue(variant);
			response.add(map);
		}
		return response;

	}

	@Override
	public List<ResponseMap> getMotorRegistration(String brand, String model) throws Exception {
		List<ResponseMap> response = new ArrayList<>();
		List<String> make = Arrays.asList("Brand New", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016");
		for (String year : make) {
			ResponseMap map = new ResponseMap();
			map.setKey(year);
			map.setValue(year);
			response.add(map);
		}
		return response;

	}

	@Override
	public List<MotorDetailsResponse> getMotorDetails() throws Exception {

		List<InsuranceDetails> insuranceDetailsList = new ArrayList<InsuranceDetails>();
		InsuranceDetails id1 = new InsuranceDetails();
		id1.setType("Premium AED");
		id1.setCompr("2,079");
		id1.setThirdParty("1,329");
		insuranceDetailsList.add(id1);
		InsuranceDetails id2 = new InsuranceDetails();
		id2.setType("Gross Premium AED");
		id1.setCompr("2,079");
		id2.setThirdParty("1,329");
		insuranceDetailsList.add(id2);
		InsuranceDetails id3 = new InsuranceDetails();
		id3.setType("VAS 5%");
		id1.setCompr("103.95");
		id3.setThirdParty("66.45");
		insuranceDetailsList.add(id3);
		InsuranceDetails id4 = new InsuranceDetails();
		id4.setType("Final Premium AED");
		id1.setCompr("2,182.95");
		id4.setThirdParty("1,395.45");
		insuranceDetailsList.add(id4);
		MotorDetailsResponse resp = new MotorDetailsResponse();
		resp.setCustomerType("Induvitual");
		resp.setVehicleGccSpesification("yes");
		resp.setTypeOfVehicle("Private");
		resp.setCoverageType("Comprehensive");
		resp.setPurposeOfTransaction("Brand New");
		resp.setVin("19XFC267XKE450363");
		resp.setModelYear("2019");
		resp.setMake("Honda");
		resp.setVehicleModel("City");
		resp.setCategory("Sedan");
		resp.setBodyType("Metal");
		resp.setEngine("2.0L");
		resp.setTransmission("Manual");
		resp.setCylinder(4);
		resp.setNoOfseats(5);
		resp.setManufacturedCountry("japan");
		resp.setCityOfRegistration("Dubai");
		resp.setNoClaimDiscount(0);
		resp.setVehilcleRepair("Approved workshop-Garage");
		resp.setSumInsured(100000);
		resp.setNationality("Indian");
		resp.setOwnersDateOfBirth("05/09/1998");
		resp.setDrivingLicenceIssueDate("20/05/2012");
		resp.setDriverAge(25);
		resp.setInsuranceDetails(insuranceDetailsList);
//		List<MotorDetailsResponse> response =motorClient.getMotorDetails(); 

		return Arrays.asList(resp);
	}

}
