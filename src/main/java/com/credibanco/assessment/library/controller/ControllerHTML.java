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
	@RequestMapping(value = { "/buscar" }, method = RequestMethod.GET)
	public String formBuscar() {
		return "buscar.html";
	}
	@RequestMapping(value = { "/autor" }, method = RequestMethod.GET)
	public String formAutor() {
		return "Autor.html";
	}
	@RequestMapping(value = { "/editorial" }, method = RequestMethod.GET)
	public String formEditorial() {
		return "Editorial.html";
	}
}
