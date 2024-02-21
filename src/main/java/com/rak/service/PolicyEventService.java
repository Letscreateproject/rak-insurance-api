package com.rak.service;

import com.rak.requestDTO.PageRequestDTO;
import com.rak.responseDTO.ApiResponseDTO;

public interface PolicyEventService {

	ApiResponseDTO getPage(PageRequestDTO request) throws Exception;

}
