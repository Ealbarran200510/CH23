package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holaSpring {
	@RequestMapping("/")
	public String hola () {
		return ("Hola Spring");
	}

}
