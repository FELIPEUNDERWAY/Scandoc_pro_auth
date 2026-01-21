package com.scandoc.service;

import com.scandoc.model.Documento;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 * Lógica de negocio para la gestión documental.
 * Almacena los datos en una lista en memoria para evitar errores de DB.
 */
@Service
public class DocumentoService {
    private final List<Documento> repositorioTemporal = new ArrayList<>();

    public String guardar(Documento doc) {
        repositorioTemporal.add(doc);
        return "Servicio Web: '" + doc.getNombre() + "' registrado exitosamente en ScanDoc Pro.";
    }

    public List<Documento> listarTodo() {
        return repositorioTemporal;
    }
}