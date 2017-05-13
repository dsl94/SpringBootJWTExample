package com.nemanja.jwt.api.security.dto;

/**
 * Created by Nemanja on 5/13/17.
 *
 * Simple class that represents user credentials
 */
public class AccountCredentials {

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
