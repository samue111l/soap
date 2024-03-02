package com.soap.Apis;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nombre",
    "marca"
})
@XmlRootElement(name = "addMotorRequest")
public class AddMotorRequest {

    @XmlElement(required = true)
    protected String nombre;

    @XmlElement(required = true)
    protected String marca;

    // Add other properties, getters, and setters as needed

    public String getMotorNombre() {
        return nombre;
    }

    public void setMotorNombre(String value) {
        this.nombre = value;
    }

    public String getMotorMarca() {
        return marca;
    }

    public void setMotorMarca(String value) {
        this.marca = value;
    }
}
