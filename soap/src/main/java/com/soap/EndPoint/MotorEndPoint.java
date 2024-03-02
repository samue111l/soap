package com.soap.EndPoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.soap.Repository.MotorRepository;
import com.soap.Apis.AddMotorRequest;
import com.soap.Apis.AddMotorResponse;
import com.soap.Apis.DeleteMotorRequest;
import com.soap.Apis.DeleteMotorResponse;
import com.soap.Apis.GetMotorRequest;
import com.soap.Apis.GetMotorResponse;
import com.soap.Apis.Motor;

@Endpoint
public class MotorEndPoint {
    private static final String NAMESPACE_URI = "http://com.soap.Apis";

    private MotorRepository motorRepository;

    @Autowired
    public MotorEndPoint(MotorRepository motorRepository) {
        this.motorRepository = motorRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMotorRequest")
    @ResponsePayload
    public GetMotorResponse getMotor(@RequestPayload GetMotorRequest request) {
        GetMotorResponse response = new GetMotorResponse();
        response.setMotor(motorRepository.findMotor(request.getMotorNombre()));

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addMotorRequest")
    @ResponsePayload
    public AddMotorResponse addMotor(@RequestPayload AddMotorRequest request) {
        AddMotorResponse response = new AddMotorResponse();

        String motorNombre = request.getMotorNombre();
        String motorMarca = request.getMotorMarca();

        Motor newMotor = new Motor();
        newMotor.setNombre(motorNombre);
        newMotor.setMarca(motorMarca);
        motorRepository.addMotor(newMotor);

        System.out.println("Motor añadido");

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteMotorRequest")
    @ResponsePayload
    public DeleteMotorResponse deleteMotor(@RequestPayload DeleteMotorRequest request) {
        DeleteMotorResponse response = new DeleteMotorResponse();

        String motorNombre = request.getMotorNombre();
        motorRepository.deleteMotor(motorNombre);

        System.out.println("Motor eliminado");

        return response;
    }
}

