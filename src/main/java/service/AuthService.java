package com.scandoc.service;

import org.springframework.stereotype.Service;

/**
 * Servicio encargado de la validación de identidades.
 * Aquí definimos quién tiene permiso de entrar al sistema ScanDoc Pro.
 */
@Service
public class AuthService {

    // Credenciales de acceso nivel Soporte
    private final String USUARIO_AUTORIZADO = "Soporte_1";
    private final String CLAVE_AUTORIZADA = "Celeste22";

    /**
     * Este método se encarga de comparar los datos que llegan del formulario
     * con los registros autorizados en nuestro servidor.
     */
    public String verificarCredenciales(String user, String pass) {

        // Primero nos aseguramos de que no nos envíen campos vacíos
        if (user == null || pass == null) {
            return "Error en la autenticación: Datos incompletos";
        }

        // Realizamos la validación lógica de igualdad
        if (user.equals(USUARIO_AUTORIZADO) && pass.equals(CLAVE_AUTORIZADA)) {
            // Mensaje de éxito requerido por la guía de la evidencia
            return "Autenticación satisfactoria";
        } else {
            // Mensaje de rechazo en caso de datos erróneos
            return "Error en la autenticación";
        }
    }
}