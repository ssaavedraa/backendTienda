package com.apis.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apis.entities.Usuarios;
import com.apis.repositories.UsuariosRepository;

@Service
public class UsuariosServiceImplement implements UsuariosService {
	
	@Autowired
	private UsuariosRepository usuariosRepo;
	
	@Override
	@Transactional
	public Optional<Usuarios> findByUsernameAndPassword(String username, String password) {
		return usuariosRepo.findByUsernameAndPassword(username, password);
	}

}
