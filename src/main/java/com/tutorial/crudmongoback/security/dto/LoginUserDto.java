package com.tutorial.crudmongoback.security.dto;

import javax.validation.constraints.NotBlank;

public class LoginUserDto {
    @NotBlank(message = "usuario obligatorio")
    private String username;

    @NotBlank(message = "contraseña obligatorio")
    private String password;

    public LoginUserDto() {
    }

    public LoginUserDto(String username, String password) {
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
