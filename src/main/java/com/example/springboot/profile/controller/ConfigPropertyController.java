package com.example.springboot.profile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.profile.properties.EmailServerConfigProperty;

@RestController
public class ConfigPropertyController {

	@Autowired
	private EmailServerConfigProperty configProperty;

	@GetMapping("/config")
	public EmailServerConfigProperty getFromConfigProperty() {
		return configProperty;
	}
}
