package com.scandoc.controller;

import com.scandoc.model.Documento;
import com.scandoc.service.DocumentoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/documentos")
public class DocumentoController {

    private final DocumentoService documentoService;

    public DocumentoController(DocumentoService documentoService) {
        this.documentoService = documentoService;
    }

    @GetMapping
    public List<Documento> obtenerTodos() {
        return documentoService.obtenerTodos();
    }

    @PostMapping("/registrar")
    public ResponseEntity<Documento> crearDocumento(@RequestBody Documento nuevoDoc) {
        Documento guardado = documentoService.guardar(nuevoDoc);
        return new ResponseEntity<>(guardado, HttpStatus.CREATED);
    }
}