package com.apis.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuarios {
	
	@Id
	private String username;
	
	@Column
	private String nombre;
	
	@Column
	private String password;
	
	@Column
	private String email;
	
	@Column
	private int rol;
	//rol 0 : admin
	//rol 1 : cliente
	//rol 2 : proveedor
	
	
	//Getters y Setters

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRol() {
		return rol;
	}

	public void setRol(int rol) {
		this.rol = rol;
	}
	
	
}
