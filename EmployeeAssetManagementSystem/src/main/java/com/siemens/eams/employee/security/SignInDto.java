package com.siemens.eams.employee.security;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SignInDto {
	@JsonProperty
    private String username;
	@JsonProperty
    private String password;

    public SignInDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

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
