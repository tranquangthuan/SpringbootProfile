package com.example.springboot.profile.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmailServerConfigComponent {
	// injects smtp.gmail.com
	@Value("${email.smtp.server}")
	private String server;

	// injects 467
	@Value("${email.smtp.port}")
	private String port;

	// injects hello@gmail.com
	@Value("${email.smtp.username}")
	private String username;

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "EmailServerConfigComponent [server=" + server + ", port=" + port + ", username=" + username + "]";
	}

}
