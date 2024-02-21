package com.rak.responseDTO;

import com.rak.requestDTO.PageRequest;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponseDTO {
 
	private String status;
    private String pageName;
    private Object payload;
    private String message;  
    private PageRequest oldPayload;
}