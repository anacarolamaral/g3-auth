package com.g3.auth.config.security;

public class TokenDTO {
	String token;
	String type;
	
	public TokenDTO(String token, String type) {
		this.token = token;
		this.type = type;
	}

	public String getToken() {
		return token;
	}

	public String getType() {
		return type;
	}
}
