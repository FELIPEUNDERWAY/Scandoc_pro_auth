package com.scandoc.repository;

import com.scandoc.model.Documento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentoRepository extends JpaRepository<Documento, Long> {
    // Esta interfaz hereda todos los métodos CRUD (Guardar, Buscar, Borrar)
    // conectando el Modelo con la Base de Datos configurada.
}
