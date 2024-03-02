package com.soap.Apis;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "successMessage"
})
@XmlRootElement(name = "deleteMotorResponse")
public class DeleteMotorResponse {

    @XmlElement(required = true)
    protected String successMessage;

    // Add other properties, getters, and setters as needed

    public String getSuccessMessage() {
        return successMessage;
    }

    public void setSuccessMessage(String value) {
        this.successMessage = value;
    }
}
