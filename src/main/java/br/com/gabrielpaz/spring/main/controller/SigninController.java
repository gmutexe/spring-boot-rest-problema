package br.com.gabrielpaz.spring.main.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("/signin")
public class SigninController {
	@PostMapping
	public String signin() {
		return "";
	}
}