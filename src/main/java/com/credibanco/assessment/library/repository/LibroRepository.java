package com.credibanco.assessment.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.credibanco.assessment.library.dto.LibroRequest;
import com.credibanco.assessment.library.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long> {
	public Libro findByNombreLibro(String nombreLibro);

	public Libro findByYear(String string);

	public Libro findByAutor(String autor);

	public Libro save(LibroRequest modelLibro);
}
