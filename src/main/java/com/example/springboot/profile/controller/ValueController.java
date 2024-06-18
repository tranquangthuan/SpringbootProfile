package com.example.springboot.profile.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueController {

	@Value("${email.smtp.server}")
	private String server;

	@Value("${email.smtp.port}")
	private String port;

	@Value("${email.smtp.username}")
	private String username;

	@Value("${common.message.hello}")
	private String helloMsg;

	@Value("${common.message.welcome}")
	private String commonWelcomeMsg;

	@Value("${message.hello}")
	private String messageHello;

	@GetMapping(value = "value")
	public Map<String, String> hello1() {
		// Message được lấy default từ file application.properties + profile active
		// properties. Nếu cùng key thì sẽ ghi đè từ profile đang active.
		// Thông thường thì file application.propertie chính là file chứa các properties
		// common
		Map<String, String> map = new HashMap<>();
		map.put("server", server);
		map.put("username", username);
		map.put("port", port);
		map.put("helloMsg", helloMsg);
		map.put("welcomeMsg", commonWelcomeMsg);
		map.put("messageHello", messageHello);

		return map;
	}

}
