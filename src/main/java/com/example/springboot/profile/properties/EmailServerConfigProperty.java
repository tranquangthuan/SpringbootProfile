package com.example.springboot.profile.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("email.smtp")
public class EmailServerConfigProperty {
	// injects smtp.gmail.com
	private String server;

	// injects 467
	private String port;

	// injects hello@gmail.com
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
