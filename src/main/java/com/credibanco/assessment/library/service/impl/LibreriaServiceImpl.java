package com.credibanco.assessment.library.service.impl;

import java.io.Console;

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
		Autor autor = autorRepository.findByNombreAutor(modelLibro.getAutor());
		Editorial editorial = editorialRepository.findByNombreEditorial(modelLibro.getEditorial());
		if ((libro != null) || (autor != null) || (editorial != null)) {
			
			return new ResponseEntity<>(null, HttpStatus.FOUND);
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}

	@Override
	public ResponseEntity<LibroRequest> GuardarLibro(LibroRequest modelLibro) {
		Libro libro = libroRepository.findByNombreLibro(modelLibro.getNombreLibro());
		if (libro == null) {
			libro = new Libro();
			libro.setAutor(modelLibro.getAutor());
			libro.setEditorial(modelLibro.getEditorial());
			libro.setGenero(modelLibro.getGenero());
			libro.setNombreLibro(modelLibro.getNombreLibro());
			libro.setNumeroPaginas(Integer.parseInt(modelLibro.getNumeroPaginas()));
			libro.setYear(Integer.parseInt(modelLibro.getYear()));

			libro = libroRepository.save(libro);
			return new ResponseEntity<>(null, HttpStatus.FOUND);
		}
		return null;
	}

	@Override
	public ResponseEntity<EditorialRequest> GuardarEditorial(EditorialRequest modelEditorial) {
		Editorial editorial = editorialRepository.findByNombreEditorial(modelEditorial.getNombreEditorial());
		if (editorial == null) {
			editorial = new Editorial();
			editorial.setNombreEditorial(modelEditorial.getNombreEditorial());
			editorial.setDireccionCorrespondencia(modelEditorial.getDireccionCorrespondencia());
			editorial.setEmailEditorial(modelEditorial.getEmailEditorial());
			editorial.setLibrosRegistrados((modelEditorial.getLibrosRegistrados()));
			editorial.setTelefono(modelEditorial.getTelefono());

			editorial = editorialRepository.save(editorial);
			return new ResponseEntity<>(null, HttpStatus.FOUND);
		}
		return null;
	}

	@Override
	public ResponseEntity<AutorRequest> GuardarAutor(AutorRequest modelAutor) {
		Autor autor = autorRepository.findByNombreAutor(modelAutor.getNombreAutor());
		if (autor == null) {
			autor = new Autor();
			autor.setNombreAutor(modelAutor.getNombreAutor());
			autor.setCiudadProcedencia(modelAutor.getCiudadProcedencia());
			autor.setEmail(modelAutor.getEmail());
			autor.setFechaNacimiento(modelAutor.getFechaNacimiento());
			
			autor = autorRepository.save(autor);
			return new ResponseEntity<>(null, HttpStatus.FOUND);
		}
		return null;
	}

}
