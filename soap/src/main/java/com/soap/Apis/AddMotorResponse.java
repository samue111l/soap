package com.soap.Apis;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "motor"
})
@XmlRootElement(name = "addMotorResponse")
public class AddMotorResponse {

    @XmlElement(required = true)
    protected Motor motor;

    // Add other properties, getters, and setters as needed

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor value) {
        this.motor = value;
    }
}
