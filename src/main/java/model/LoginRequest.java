package com.scandoc.model;

/**
 * Molde para capturar los datos de inicio de sesión.
 * Esta clase facilita el transporte seguro de las credenciales desde el cliente.
 */
public class LoginRequest {
    private String usuario;
    private String password;

    // Métodos para leer y escribir los datos (Getters y Setters)
    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}