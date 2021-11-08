package com.apis.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.apis.entities.Usuarios;
import com.apis.services.UsuariosService;

@RestController
@RequestMapping("user/")
public class UsuariosController {
	
	@Autowired
	private UsuariosService usuariosService;
	
	@PostMapping("auth")
	public ResponseEntity<?> auth(@RequestBody Usuarios user){
		Map<String, String> map = new HashMap<String, String>();
		Optional<Usuarios> authUser = usuariosService.findByUsernameAndPassword(user.getUsername(), user.getPassword());
		if (!authUser.isPresent()) {
			map.put("status", "ERROR");
			return ResponseEntity.status(HttpStatus.OK).body(map);
		}
		map.put("status", "OK");
		map.put("name", authUser.get().getNombre());
		map.put("rol", Integer.toString(authUser.get().getRol()));
		return ResponseEntity.status(HttpStatus.OK).body(map);
		
	}

}
