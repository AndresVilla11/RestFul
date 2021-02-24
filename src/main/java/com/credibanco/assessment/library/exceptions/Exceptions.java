package com.credibanco.assessment.library.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

public class Exceptions {
	@ControllerAdvice
	class GlobalDefaultExceptionHandler {
	  public static final String DEFAULT_ERROR_VIEW = "error";

	  @ExceptionHandler(value = Exception.class)
	  public ModelAndView
	  defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
	    return "redirect:/";
	  }
	}
	
}
