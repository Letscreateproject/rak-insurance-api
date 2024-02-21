package com.rak.service.impl;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rak.requestDTO.PageRequest;
import com.rak.requestDTO.PageRequestDTO;
import com.rak.responseDTO.ApiResponseDTO;
import com.rak.service.MotorService;
import com.rak.service.PolicyEventService;

@Service
public class PolicyEventServiceImpl implements PolicyEventService{

	@Autowired
    private KieContainer kieContainer;
	
	@Autowired
    private MotorService motorService;
	
	@Override
	public ApiResponseDTO getPage(PageRequestDTO request) throws Exception {
		PageRequest pageRequest = request.getPageRequest();
		ApiResponseDTO responseDTO= new ApiResponseDTO();
		KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("responseDTO", responseDTO);
        kieSession.insert(request);
        kieSession.fireAllRules();
        kieSession.dispose();
        
        switch(responseDTO.getPageName()) {
        case "brand":
        	responseDTO.setPayload(motorService.getMotorBrand());
        	break;
        case "model":
        	responseDTO.setPayload(motorService.getMotorModel(pageRequest.getBrand()));
        	break;
        case "variant":
        	responseDTO.setPayload(motorService.getMotorVariant(pageRequest.getBrand(), pageRequest.getModel()));
        	break;
        case "regyear":
        	responseDTO.setPayload(motorService.getMotorRegistration(pageRequest.getBrand(), pageRequest.getModel()));
        	break;
        case "details":
        	responseDTO.setPayload(motorService.getMotorDetails());
        	break;
        	
        }
		
		return responseDTO;
	}

}
