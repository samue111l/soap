package com.soap.Apis;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nombre"
})
@XmlRootElement(name = "deleteMotorRequest")
public class DeleteMotorRequest {

    @XmlElement(required = true)
    protected String nombre;

    // Add other properties, getters, and setters as needed

    public String getMotorNombre() {
        return nombre;
    }

    public void setMotorNombre(String value) {
        this.nombre = value;
    }
}
