package com.rak.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExceptionResponse {

	private Date timestamp;
	private int status;
	private HttpStatus httpStatus;
	private String responseMessage;
	private String requestURL;

}
