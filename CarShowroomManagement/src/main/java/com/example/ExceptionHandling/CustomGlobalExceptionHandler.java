package com.example.ExceptionHandling;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

//this annotation allows to handle exception across whole application in one global handling component.
@ControllerAdvice
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler
 {
	//method used to handle all validation exception
	
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,HttpHeaders headers,HttpStatus status,WebRequest request)
	{
		Map<String,String>errors=new HashMap<>();					//create hashmap
		ex.getBindingResult().getAllErrors().forEach((error)->{    //use forEach loop
			String fieldname=((FieldError)error).getField();
			String  message=error.getDefaultMessage();
			errors.put(fieldname, message);							//put value into hashmap
		});
		return new ResponseEntity<Object>(errors,HttpStatus.BAD_REQUEST);
	}


}
