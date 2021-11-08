package com.apis.services;

import java.util.Optional;

import com.apis.entities.Usuarios;

public interface UsuariosService {
	
	public Optional<Usuarios> findByUsernameAndPassword(String username, String password);
	
}
