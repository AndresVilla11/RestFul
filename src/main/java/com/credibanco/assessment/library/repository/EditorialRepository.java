package com.credibanco.assessment.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.credibanco.assessment.library.dto.EditorialRequest;
import com.credibanco.assessment.library.model.Editorial;

public interface EditorialRepository extends JpaRepository<Editorial, Long>  {
	public Editorial findByNombreEditorial(String nombreEditorial);
	public Editorial save(EditorialRequest modelEditorial);
}