package com.credibanco.assessment.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LIBRO")
public class Editorial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_EDITORIAL")
	private long id;

	@Column(name = "NOMBRE_EDITORIAL")
	private String nombreEditorial;
	@Column(name = "DIRECCION")
	private String direccionCorrespondencia;
	@Column(name = "TELEFONO")
	private int telefono;
	@Column(name = "EMAIL")
	private String emailEditorial;
	@Column(name = "REGISTRADOS")
	private int librosRegistrados;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
