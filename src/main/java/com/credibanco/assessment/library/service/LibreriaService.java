package com.credibanco.assessment.library.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.credibanco.assessment.library.dto.AutorRequest;
import com.credibanco.assessment.library.dto.EditorialRequest;
import com.credibanco.assessment.library.dto.LibroRequest;

@Service
public interface LibreriaService {
	public ResponseEntity<LibroRequest> GuardarLibro(LibroRequest modelLibro);

	public ResponseEntity<LibroRequest> BuscarLibro(LibroRequest modelLibro);

	public ResponseEntity<EditorialRequest> GuardarEditorial(EditorialRequest modelEditorial);

	public ResponseEntity<AutorRequest> GuardarAutor(AutorRequest modelAutor);

}
