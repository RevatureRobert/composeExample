package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@Value("${message}")
	private String message;
	
	@GetMapping(value="/message")
	public String getMessage() {
		return message;
	}
}
