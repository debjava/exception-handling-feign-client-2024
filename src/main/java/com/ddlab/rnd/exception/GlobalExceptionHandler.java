package com.ddlab.rnd.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler({ InternalServerErrorException.class })
	public ResponseEntity<ErrorResponse> handleProductServiceNotAvailableException(
			InternalServerErrorException exception, WebRequest request) {
		System.out.println("----------- Called ------------");
		return new ResponseEntity("Some unwanted application Error", HttpStatus.INTERNAL_SERVER_ERROR);
//        return new ResponseEntity<>(new ErrorResponse(
//          HttpStatus.INTERNAL_SERVER_ERROR,
//          exception.getMessage(),
//          request.getDescription(false)),
//          HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler({ ApplicationBadRequestException.class })
	public ResponseEntity<String> handleBadRequestException(ApplicationBadRequestException exception,
			WebRequest request) {
		System.out.println("----------- Called ------------");
		return new ResponseEntity<String>("Some unwanted application Error", HttpStatus.INTERNAL_SERVER_ERROR);
//        return new ResponseEntity<>(new ErrorResponse(
//          HttpStatus.INTERNAL_SERVER_ERROR,
//          exception.getMessage(),
//          request.getDescription(false)),
//          HttpStatus.INTERNAL_SERVER_ERROR);
	}

}