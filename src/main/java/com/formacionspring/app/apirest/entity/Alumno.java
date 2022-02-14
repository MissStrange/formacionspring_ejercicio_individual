package com.formacionspring.app.apirest.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name="alumnos")
public class Alumno implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private String nombre;
	
	@Column (nullable = false)
	private String apellido;
	
	@Column(nullable = false)
	private String dni;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false)
	private String direccion;
	
	@Column(nullable = false)
	private int cp;
	
	private String imagen;
	
	
	private static final long serialVersionUID = 1L;


	public long getId() {
		
		return id;
	}


	public void setId(long id) {
		
		this.id = id;
	}


	public String getNombre() {
		
		return nombre;
	}


	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}


	public String getApellido() {
		
		return apellido;
	}


	public void setApellido(String apellido) {
		
		this.apellido = apellido;
	}


	public String getDni() {
		
		return dni;
	}


	public void setDni(String dni) {
		
		this.dni = dni;
	}


	public String getEmail() {
		
		return email;
	}


	public void setEmail(String email) {
		
		this.email = email;
	}


	public String getDireccion() {
		
		return direccion;
	}


	public void setDireccion(String direccion) {
		
		this.direccion = direccion;
	}	

	public int getCp() {
		
		return cp;
	}


	public void setCp(int cp) {
		
		this.cp = cp;
	}


	public String getImagen() {
		
		return imagen;
	}


	public void setImagen(String imagen) {
		
		this.imagen = imagen;
	}

}