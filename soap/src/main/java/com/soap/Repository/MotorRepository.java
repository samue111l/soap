package com.soap.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.soap.Apis.Motor;
import com.soap.Entities.Motordb;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

@Component
public class MotorRepository {
    private List<Motor> motores = new ArrayList<>();
    private Repositorydb repositorydb;

    @Autowired
    public MotorRepository(Repositorydb repositorydb) {
        this.repositorydb = repositorydb;
    }

    // Initialization logic to load motors from the database
    public void initData() {
        List<Motordb> motorEntities = repositorydb.findAll();

        for (Motordb motordb : motorEntities) {
            Motor motor = new Motor();
            motor.setNombre(motordb.getNombre());
            motor.setMarca(motordb.getMarca());

            motores.add(motor);
        }
    }

    // Method to add a new motor
    public void addMotor(Motor newMotor) {
        Assert.notNull(newMotor, "El motor a agregar no debe ser nulo");

        // You may want to check if the motor already exists before adding
        if (findMotor(newMotor.getNombre()) == null) {
            motores.add(newMotor);

            // Optionally, you can also save the new motor to the database
            Motordb newMotorEntity = new Motordb();
            newMotorEntity.setNombre(newMotor.getNombre());
            newMotorEntity.setMarca(newMotor.getMarca());
            repositorydb.save(newMotorEntity);
        } else {
            System.out.println("Motor with the same name already exists.");
        }
    }

    // Method to find a motor by name
    public Motor findMotor(String name) {
        Assert.notNull(name, "El nombre del motor no debe ser nulo");

        // Find the Motor with the given name
        return motores.stream()
                .filter(motor -> name.equals(motor.getNombre()))
                .findFirst()
                .orElse(null);
    }

    // Method to delete a motor by name
    public void deleteMotor(String name) {
        Assert.notNull(name, "El nombre del motor a eliminar no debe ser nulo");

        // Comprobar que existe
        Iterator<Motor> iterator = motores.iterator();
        while (iterator.hasNext()) {
            Motor motor = iterator.next();
            if (name.equals(motor.getNombre())) {
                iterator.remove();

                // Optionally, you can also delete the motor from the database
                repositorydb.deleteByName(name);
            }
        }
    }
}
