package com.example.springboot.profile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.profile.properties.EmailServerConfigComponent;

@RestController
public class ValueAsComponetController {

	@Autowired
	private EmailServerConfigComponent emailServerConfigComponent;

	@GetMapping(value = "value2")
	public EmailServerConfigComponent hello2() {
		return emailServerConfigComponent;
	}
}
