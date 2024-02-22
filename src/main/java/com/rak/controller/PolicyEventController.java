package com.rak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rak.requestDTO.PageRequestDTO;
import com.rak.responseDTO.ApiResponseDTO;
import com.rak.service.PolicyEventService;


@RestController
@RequestMapping("/rak")
@CrossOrigin
public class PolicyEventController {
	
	@Autowired
	PolicyEventService policyEventService;
	
	@PostMapping("/dynamic")
	public ResponseEntity<ApiResponseDTO> getPage(@RequestBody PageRequestDTO request) throws Exception{
		ApiResponseDTO response = policyEventService.getPage(request);
		response.setMessage("Page response found");
		response.setStatus("SUCCESS");
		response.setOldPayload(request.getPageRequest());
		return ResponseEntity.ok(response);
		
	}

}
