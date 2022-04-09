package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

//Especificar que é um Controller
@RestController
//Especificar a localização do Rest no Server
@RequestMapping(value = "/users")
public class UserResource {

	//Indicar o método que será executado no end-point
	@GetMapping
	//método instancia nova classe e retorna
	public ResponseEntity<User> findAll(){
		User objUser = new User(1L, "Maria Joaquina", "maria.jaoquina@gmail.com", "99999999999", "senhamaria");
		
		return ResponseEntity.ok().body(objUser);
	}
}
