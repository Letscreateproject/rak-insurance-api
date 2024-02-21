//package com.rak.util;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.core.ParameterizedTypeReference;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//import com.rak.constants.ValueConstants;
//import com.rak.exception.LoginFailedException;
//import com.rak.requestDTO.AuthRequestDTO;
//import com.rak.responseDTO.AuthResponseDTO;
//
//import lombok.extern.slf4j.Slf4j;
//
//@Slf4j
//@Service
//public class ApiHelper {
//
//	@Value("${login.url}")
//	private String authUrl;
//
//	@Value("${login.username}")
//	private String userName;
//
//	@Value("${login.password}")
//	private String password;
//
//	@Autowired
//	RestTemplate restTemplate;
//
//	public String getAuthToken() {
//		log.info("Entered fetch token");
//		AuthRequestDTO request = new AuthRequestDTO();
//		request.setUsername(userName);
//		request.setPassword(password);
//		HttpHeaders headers = new HttpHeaders();
//		headers.add(HttpHeaders.ACCEPT, MediaType.ALL_VALUE);
//		HttpEntity<Object> entity = new HttpEntity<>(request, headers);
//		String token = null;
//		ResponseEntity<AuthResponseDTO> response = null;
//		try {
//			response = restTemplate.exchange(authUrl, HttpMethod.POST, entity, AuthResponseDTO.class);
//			token = response.getBody().getToken();
//		} catch (Exception e) {
//			throw new LoginFailedException("Error occcured while login :{} " + e.getMessage());
//		}
//		return token;
//
//	}
//
//	public <T> ResponseEntity<T> callPost(String url, Object request, ParameterizedTypeReference<T> responseType) {
//		HttpHeaders headers = new HttpHeaders();
//		headers.add(HttpHeaders.ACCEPT, MediaType.ALL_VALUE);
//		headers.add(ValueConstants.AUTHORIZATION, ValueConstants.BEARER + " " + getAuthToken());
//		HttpEntity<Object> entity = new HttpEntity<>(request, headers);
//		return restTemplate.exchange(url, HttpMethod.POST, entity, responseType);
//	}
//
//	public <T> ResponseEntity<T> callGet(String url, ParameterizedTypeReference<T> responseType) {
//		HttpHeaders headers = new HttpHeaders();
//		headers.add(HttpHeaders.ACCEPT, MediaType.ALL_VALUE);
//		headers.add(ValueConstants.AUTHORIZATION, ValueConstants.BEARER + " " + getAuthToken());
//		HttpEntity<String> entity = new HttpEntity<>(headers);
//		return restTemplate.exchange(url, HttpMethod.POST, entity, responseType);
//	}
//
//}
