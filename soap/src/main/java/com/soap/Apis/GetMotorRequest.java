package com.soap.Apis;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nombre"
})
@XmlRootElement(name = "getMotorRequest")
public class GetMotorRequest {

    protected String nombre;


    public String getMotorNombre() {
        return nombre;
    }

    
    public void setMotorNombre(String value) {
        this.nombre = value;
    }

}
