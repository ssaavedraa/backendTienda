package com.apis.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apis.entities.Usuarios;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, String>{

	Optional<Usuarios> findByUsernameAndPassword(String username, String password);
	
}
