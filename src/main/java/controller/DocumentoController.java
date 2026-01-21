package com.scandoc.controller;

import com.scandoc.model.Documento;
import com.scandoc.service.DocumentoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * API REST para la gestión de documentos.
 * Expone los endpoints requeridos para la evidencia AA5-EV03.
 */
@RestController
@RequestMapping("/api/documentos")
@CrossOrigin(origins = "*") // Permite conexión con el frontend
public class DocumentoController {

    private final DocumentoService documentoService;

    public DocumentoController(DocumentoService documentoService) {
        this.documentoService = documentoService;
    }

    // Endpoint para registrar: POST http://localhost:8080/api/documentos/registrar
    @PostMapping("/registrar")
    public String registrar(@RequestBody Documento nuevoDoc) {
        return documentoService.guardar(nuevoDoc);
    }

    // Endpoint para listar: GET http://localhost:8080/api/documentos/todos
    @GetMapping("/todos")
    public List<Documento> listar() {
        return documentoService.listarTodo();
    }
}