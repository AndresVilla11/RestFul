package com.credibanco.assessment.library.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.credibanco.assessment.library.dto.AutorRequest;
import com.credibanco.assessment.library.dto.EditorialRequest;
import com.credibanco.assessment.library.dto.LibroRequest;
import com.credibanco.assessment.library.model.Autor;
import com.credibanco.assessment.library.model.Editorial;
import com.credibanco.assessment.library.model.Libro;
import com.credibanco.assessment.library.repository.AutorRepository;
import com.credibanco.assessment.library.repository.EditorialRepository;
import com.credibanco.assessment.library.repository.LibroRepository;
import com.credibanco.assessment.library.service.LibreriaService;

@Service
public class LibreriaServiceImpl implements LibreriaService {

	@Autowired
	AutorRepository autorRepository;
	@Autowired
	LibroRepository libroRepository;
	@Autowired
	EditorialRepository editorialRepository;
 
	@Override
	public ResponseEntity<LibroRequest> BuscarLibro(LibroRequest modelLibro) {
		Libro libro = libroRepository.findByNombreLibro(modelLibro.getNombreLibro());
		Libro autor = libroRepository.findByAutor(modelLibro.getAutor());
		Libro year = libroRepository.findByYear(modelLibro.getYear());
		if ((libro == null)||(autor == null)||(year == null)) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(modelLibro, HttpStatus.FOUND);
	}

	@Override
	public ResponseEntity<LibroRequest> GuardarLibro(LibroRequest modelLibro) {
		Libro libro = libroRepository.findByNombreLibro(modelLibro.getNombreLibro());
		if (libro != null) {
			libro = libroRepository.save(modelLibro);
			return new ResponseEntity<>(null, HttpStatus.FOUND);
		}
		return null;
	}

	@Override
	public ResponseEntity<EditorialRequest> GuardarEditorial(EditorialRequest modelEditorial) {
		Editorial editorial = editorialRepository.findByNombreEditorial(modelEditorial.getNombreEditorial());
		if (editorial != null) {
			editorial = editorialRepository.save(modelEditorial);
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		return null;
	}

	@Override
	public ResponseEntity<AutorRequest> GuardarAutor(AutorRequest modelAutor) {
		Autor autor = autorRepository.findByNombreAutor(modelAutor.getNombreAutor());
		if (autor != null) {
			autor = autorRepository.save(modelAutor);
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		return null;
	}

}
