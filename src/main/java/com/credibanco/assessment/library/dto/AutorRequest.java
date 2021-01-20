package com.credibanco.assessment.library.dto;

public class AutorRequest {

	public String nombreAutor;
	public String fechaNacimiento;
	public String ciudadProcedencia;
	public String email;

	public AutorRequest(String nombreAutor, String fechaNacimiento, String ciudadProcedencia, String email) {
		super();
		this.nombreAutor = nombreAutor;
		this.fechaNacimiento = fechaNacimiento;
		this.ciudadProcedencia = ciudadProcedencia;
		this.email = email;
	}

	public String getNombreAutor() {
		return nombreAutor;
	}

	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCiudadProcedencia() {
		return ciudadProcedencia;
	}

	public void setCiudadProcedencia(String ciudadProcedencia) {
		this.ciudadProcedencia = ciudadProcedencia;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
