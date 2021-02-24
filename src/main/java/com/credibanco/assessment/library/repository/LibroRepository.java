package com.credibanco.assessment.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.credibanco.assessment.library.dto.LibroRequest;
import com.credibanco.assessment.library.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long> {
	public Libro findByNombreLibro(String nombreLibro);

	public Libro findByYear(String string);

	public Libro findByAutor(String autor);

	public Libro save(LibroRequest modelLibro);
	
	@Query(value="select count(*) FROM LIBRO WHERE editorial =: editorialBusq", nativeQuery=true)
    Long getSum(String editorialBusq);
}
