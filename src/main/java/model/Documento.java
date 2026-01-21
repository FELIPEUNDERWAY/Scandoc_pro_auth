package com.scandoc.model;

/**
 * Entidad que representa un archivo dentro de ScanDoc Pro.
 * No requiere anotaciones @Entity para esta fase del proyecto.
 */
public class Documento {
    private Long id;
    private String nombre;
    private String categoria;
    private String fechaCarga;

    // Constructor vacío obligatorio para la serialización JSON
    public Documento() {}

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public String getFechaCarga() { return fechaCarga; }
    public void setFechaCarga(String fechaCarga) { this.fechaCarga = fechaCarga; }
}