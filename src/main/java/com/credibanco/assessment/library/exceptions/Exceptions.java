package com.credibanco.assessment.library.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class Exceptions {
	@ControllerAdvice
	class GlobalDefaultExceptionHandler {
	  public static final String DEFAULT_ERROR_VIEW = "error";

	  @ExceptionHandler(value = Exception.class)
	  public String
	  defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
	    return "error";
	  }
	}
	
}
