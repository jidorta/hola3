package com.ibandorta4.hola.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hola Mundo";
	}

}
