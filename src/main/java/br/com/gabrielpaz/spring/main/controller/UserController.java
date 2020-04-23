package br.com.gabrielpaz.spring.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gabrielpaz.spring.main.model.User;
import br.com.gabrielpaz.spring.main.repository.UserRepository;

@RestController @RequestMapping("/user")
public class UserController {
	@Autowired
	private UserRepository repository;
	
	@GetMapping(path="/all", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Iterable<User>> all() {
		return new ResponseEntity<Iterable<User>>(repository.findAll(), HttpStatus.OK);
	}
}