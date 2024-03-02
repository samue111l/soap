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
@XmlRootElement(name = "getMotorResponse")
public class GetMotorResponse {

    @XmlElement(required = true)
    protected Motor motor;

    /**
     * Obtiene el valor de la propiedad employeeInfo.
     * 
     * @return
     *     possible object is
     *     {@link Motor }
     *     
     */
    public Motor getMotor() {
        return motor;
    }

    /**
     * Define el valor de la propiedad employeeInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link Motor }
     *     
     */
    public void setMotor(Motor value) {
        this.motor = value;
    }

}
