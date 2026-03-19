package com.scandoc.service;

import com.scandoc.model.Documento;
import com.scandoc.repository.DocumentoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DocumentoService {

    private final DocumentoRepository documentoRepository;

    public DocumentoService(DocumentoRepository documentoRepository) {
        this.documentoRepository = documentoRepository;
    }

    public List<Documento> obtenerTodos() {
        return documentoRepository.findAll();
    }

    public Documento guardar(Documento documento) {
        return documentoRepository.save(documento);
    }
}