package com.credibanco.assessment.library.dto;

public class EditorialRequest {
	private String nombreEditorial;
	private String direccionCorrespondencia;
	private int telefono;
	private String emailEditorial;
	private int librosRegistrados;

	public EditorialRequest(String nombreEditorial, String direccionCorrespondencia, int telefono,
			String emailEditorial, int librosRegistrados) {
		this.nombreEditorial = nombreEditorial;
		this.direccionCorrespondencia = direccionCorrespondencia;
		this.telefono = telefono;
		this.emailEditorial = emailEditorial;
		this.librosRegistrados = librosRegistrados;
	}

	public String getNombreEditorial() {
		return nombreEditorial;
	}

	public void setNombreEditorial(String nombreEditorial) {
		this.nombreEditorial = nombreEditorial;
	}

	public String getDireccionCorrespondencia() {
		return direccionCorrespondencia;
	}

	public void setDireccionCorrespondencia(String direccionCorrespondencia) {
		this.direccionCorrespondencia = direccionCorrespondencia;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmailEditorial() {
		return emailEditorial;
	}

	public void setEmailEditorial(String emailEditorial) {
		this.emailEditorial = emailEditorial;
	}

	public int getLibrosRegistrados() {
		return librosRegistrados;
	}

	public void setLibrosRegistrados(int librosRegistrados) {
		this.librosRegistrados = librosRegistrados;
	}

}
