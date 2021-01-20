package com.credibanco.assessment.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.credibanco.assessment.library.dto.AutorRequest;
import com.credibanco.assessment.library.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long>  {
	public Autor findByNombreAutor(String nombreAutor);
	public Autor save(AutorRequest modelAutor);
}

