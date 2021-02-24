package com.credibanco.assessment.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.credibanco.assessment.library.dto.AutorRequest;
import com.credibanco.assessment.library.dto.EditorialRequest;
import com.credibanco.assessment.library.dto.LibroRequest;
import com.credibanco.assessment.library.repository.LibroRepository;
import com.credibanco.assessment.library.service.LibreriaService;


import javax.validation.Valid;

@RestController
@RequestMapping(path = "/registrar")
public class ControllerRest {

	@Autowired
	LibreriaService libreriaService;
	@Autowired
	LibroRepository libroRepository;

	@PostMapping(path = "/libro/creacion", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
	public ResponseEntity<LibroRequest> registrarLibro(@Valid LibroRequest libro) {
		return libreriaService.GuardarLibro(libro);
	}

	@PostMapping(path = "/buscar/libro", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
	public ResponseEntity<LibroRequest> buscarLibro(@Valid LibroRequest libro) {
		return libreriaService.BuscarLibro(libro);
	}

	@PostMapping(path = "/autor/creacion", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
	public ResponseEntity<AutorRequest> registrarLibro(@Valid AutorRequest autor) {
		return libreriaService.GuardarAutor(autor);
	}

	@PostMapping(path = "/editorial/creacion", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
	public ResponseEntity<EditorialRequest> registrarLibro(@Valid EditorialRequest editorial) {
		return libreriaService.GuardarEditorial(editorial);
	}
}