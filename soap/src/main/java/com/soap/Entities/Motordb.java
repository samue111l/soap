package com.soap.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "motores")
public class Motordb {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    Long id;

    @Column(name = "nombre", nullable = false)
    String nombre;

    @Column(name = "marca", nullable = false)
    String marca;

    // Constructors
    public Motordb(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Motordb(String nombre) {
        this.nombre = nombre;
    }

    public Motordb() {
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    

    // toString method (for debugging/logging)
    @Override
    public String toString() {
        return "Motor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
