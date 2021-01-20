package com.credibanco.assessment.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerHTML {

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String controlDeInicio() {
		return "Home";
	}
}
