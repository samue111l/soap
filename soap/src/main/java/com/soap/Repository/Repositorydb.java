package com.soap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soap.Entities.Motordb;

@Repository("repositorydb")
public interface Repositorydb extends JpaRepository<Motordb, Integer> {
    void deleteByName(String nombre);
}