//package com.rak.controller;
//
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.rak.service.MotorService;
//
//@RestController
//@RequestMapping("/motor")
//public class MotorController {
//	
//	@Autowired
//	MotorService motorService;
//	
//	@GetMapping("/getMotorBrand")
//	public ResponseEntity<Map<String, String>> getMotorBrand() throws Exception{
//		return ResponseEntity.ok(motorService.getMotorBrand());
//	}
//	
//	@GetMapping("/getMotorModel")
//	public ResponseEntity<Map<String, String>> getMotorModel(@RequestParam String brand) throws Exception{
//		return ResponseEntity.ok(motorService.getMotorModel(brand));
//	}
//	
//	@GetMapping("/getMotorVariant")
//	public ResponseEntity<Map<String, String>> getMotorVariant(@RequestParam String brand, @RequestParam String model) throws Exception{
//		return ResponseEntity.ok(motorService.getMotorVariant(brand, model));
//	}
//	
//	@GetMapping("/getMotorRegistration")
//	public ResponseEntity<Map<String, String>> getMotorRegistration(@RequestParam String brand, @RequestParam String model) throws Exception{
//		return ResponseEntity.ok(motorService.getMotorRegistration(brand, model));
//	}
//
//}
