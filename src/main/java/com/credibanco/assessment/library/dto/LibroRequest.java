package com.credibanco.assessment.library.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class LibroRequest {

	private String nombreLibro;
	@Positive
	private int year;
	private String genero;
	private int numeroPaginas;
	@NotNull
	private String editorial;
	@NotNull
	private String autor;

	public LibroRequest(String nombreLibro, int year, String genero, int numeroPaginas, String editorial, String autor) {
		this.nombreLibro = nombreLibro;
		this.year = year;
		this.genero = genero;
		this.numeroPaginas = numeroPaginas;
		this.editorial = editorial;
		this.autor = autor;
	}

	public String getNombreLibro() {
		return nombreLibro;
	}

	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}
