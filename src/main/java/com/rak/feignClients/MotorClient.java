package com.rak.feignClients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rak.responseDTO.MotorDetailsResponse;

@FeignClient(name="motor-service", url = "https://df10f507-5e80-4913-9509-11b591cb08d1.mock.pstmn.io/api/motor")
public interface MotorClient {
	
	@GetMapping("/getmotorbrand")
	List<String> getMotorBrand();
	
	@GetMapping("/getmotormodel")
	List<String> getMotorModel(@RequestParam String brand);

	@GetMapping("/getmotorvariant")
	List<String> getMotorVariant(@RequestParam String brand, @RequestParam String model);

	@GetMapping("/getmotorregistration")
	List<String> getMotorRegistration(@RequestParam String brand, @RequestParam String model);

	@GetMapping("/getmotordetails")
	List<MotorDetailsResponse> getMotorDetails();
	

}
