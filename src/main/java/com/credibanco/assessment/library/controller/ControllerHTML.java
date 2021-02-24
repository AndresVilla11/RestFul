package com.credibanco.assessment.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/registrar")
public class ControllerHTML {

	@RequestMapping(value = { "/libro" }, method = RequestMethod.GET)
	public String controlDeInicio() {
		return "Home.html";
	}
	@RequestMapping(value = { "creacion/libro" }, method = RequestMethod.GET)
	public String control() {
		return "redirect:/registrar/libro";
	}
	@RequestMapping(value = { "error" }, method = RequestMethod.GET)
	public String error() {
		return "redirect:/Home";
	}
}
