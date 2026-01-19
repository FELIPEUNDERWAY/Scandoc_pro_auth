package com.scandoc.controller;

import com.scandoc.model.LoginRequest;
import com.scandoc.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2/seguridad") // Ruta profesional para la versión 2.0
@CrossOrigin(origins = "*")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest datos) {
        // Consultamos la lógica humana definida en el servicio de soporte
        return authService.verificarCredenciales(datos.getUsuario(), datos.getPassword());
    }
}