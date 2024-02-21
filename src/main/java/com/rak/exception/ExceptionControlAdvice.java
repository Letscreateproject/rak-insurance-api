package com.rak.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionControlAdvice {

	/**
	 * @param ex
	 * @param request
	 * @return ExceptionResponse
	 * Method for handling RunTimeException
	 */
	@ExceptionHandler(Throwable.class)
	public ResponseEntity<ExceptionResponse> handleRunTimeException(Exception ex, final HttpServletRequest request) {
		ExceptionResponse response = new ExceptionResponse();
		response.setResponseMessage(ex.getMessage());
		response.setRequestURL(request.getRequestURI());
		response.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR);
		response.setTimestamp(new Date());
		response.setStatus(response.getHttpStatus().value());
		return new ResponseEntity<>(response, response.getHttpStatus());
	}
	
	@ExceptionHandler(LoginFailedException.class)
	public ResponseEntity<Object> handleResourceNotFoundException(LoginFailedException ex, final HttpServletRequest request ){
		return buildExceptionResponse(HttpStatus.NOT_FOUND, ex, request);
	}

	private ResponseEntity<Object> buildExceptionResponse(HttpStatus status, Exception ex,
			HttpServletRequest request) {
		ExceptionResponse response = new ExceptionResponse();
		response.setResponseMessage(ex.getMessage());
		response.setRequestURL(request.getRequestURI());
		response.setHttpStatus(status);
		response.setTimestamp(new Date());
		response.setStatus(response.getHttpStatus().value());
		return new ResponseEntity<>(response, response.getHttpStatus());
	}public ExceptionControlAdvice() {
		// TODO Auto-generated constructor stub
	}
}
