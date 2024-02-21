package com.rak.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rak.feignClients.MotorClient;
import com.rak.responseDTO.MotorDetailsResponse;
import com.rak.responseDTO.ResponseMap;
import com.rak.service.MotorService;

@Service
public class MotorServiceImpl implements MotorService {

	@Autowired
	MotorClient motorClient;

	@Override
	public List<ResponseMap> getMotorBrand() throws Exception {

		List<ResponseMap> response=new ArrayList<>();
		for(String brand: motorClient.getMotorBrand()) {
			ResponseMap map = new ResponseMap();
			map.setKey(brand);
			map.setValue(brand);
			response.add(map);
		}
		return response;
	}

	@Override
	public List<ResponseMap> getMotorModel(String brand) throws Exception {
		List<ResponseMap> response=new ArrayList<>();
		for(String model: motorClient.getMotorModel(brand)) {
			ResponseMap map = new ResponseMap();
			map.setKey(model);
			map.setValue(model);
			response.add(map);
		}
		return response;
	}

	@Override
	public List<ResponseMap> getMotorVariant(String brand, String model) throws Exception {
		List<ResponseMap> response=new ArrayList<>();
		for(String variant: motorClient.getMotorVariant(brand, model)) {
			ResponseMap map = new ResponseMap();
			map.setKey(variant);
			map.setValue(variant);
			response.add(map);
		}
		return response;
		
	}

	@Override
	public List<ResponseMap> getMotorRegistration(String brand, String model) throws Exception {
		List<ResponseMap> response=new ArrayList<>();
		for(String year: motorClient.getMotorRegistration(brand, model)) {
			ResponseMap map = new ResponseMap();
			map.setKey(year);
			map.setValue(year);
			response.add(map);
		}
		return response;
		
	}

	@Override
	public List<MotorDetailsResponse> getMotorDetails() throws Exception {
		List<MotorDetailsResponse> response =motorClient.getMotorDetails(); 
		
		return response;
	}

}
