package com.credibanco.assessment.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/registrar")
public class ControllerHTML {

	@RequestMapping(value = { "/libro" }, method = RequestMethod.GET)
	public String formLibro() {
		return "Home.html";
	}
	@RequestMapping(value = { "/libro/creacion" }, method = RequestMethod.GET)
	public String controlLibro() {
		return "redirect:/registrar/libro";
	}
	@RequestMapping(value = { "/autor" }, method = RequestMethod.GET)
	public String formAutor() {
		return "Autor.html";
	}
}
