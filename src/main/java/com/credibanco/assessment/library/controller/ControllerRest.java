package com.credibanco.assessment.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.credibanco.assessment.library.dto.AutorRequest;
import com.credibanco.assessment.library.dto.EditorialRequest;
import com.credibanco.assessment.library.dto.LibroRequest;
import com.credibanco.assessment.library.repository.LibroRepository;
import com.credibanco.assessment.library.service.LibreriaService;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "creacion")
public class ControllerRest {

	@Autowired
	LibreriaService libreriaService;
	@Autowired
	LibroRepository libroRepository;

	@PostMapping(path = "/libro")
	public ResponseEntity<LibroRequest> registrarLibro(@Valid @RequestBody LibroRequest libro) {
		return libreriaService.GuardarLibro(libro);
	}

	@PostMapping(path = "/buscar/libro")
	public ResponseEntity<LibroRequest> buscarLibro(@Valid @RequestBody LibroRequest libro) {
		return libreriaService.BuscarLibro(libro);
	}

	@PostMapping(path = "/autor")
	public ResponseEntity<AutorRequest> registrarLibro(@Valid @RequestBody AutorRequest autor) {
		return libreriaService.GuardarAutor(autor);
	}

	@PostMapping(path = "/editorial")
	public ResponseEntity<EditorialRequest> registrarLibro(@Valid @RequestBody EditorialRequest editorial) {
		return libreriaService.GuardarEditorial(editorial);
	}
}