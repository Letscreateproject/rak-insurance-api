package com.rak.service;

import java.util.List;

import com.rak.responseDTO.MotorDetailsResponse;
import com.rak.responseDTO.ResponseMap;

public interface MotorService {

	List<ResponseMap> getMotorBrand() throws Exception;

	List<ResponseMap> getMotorModel(String brand) throws Exception;

	List<ResponseMap> getMotorVariant(String brand, String model) throws Exception;

	List<ResponseMap> getMotorRegistration(String brand, String model) throws Exception;

	List<MotorDetailsResponse> getMotorDetails()throws Exception;


}
