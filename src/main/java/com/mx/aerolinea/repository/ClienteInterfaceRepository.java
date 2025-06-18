package com.mx.aerolinea.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.aerolinea.model.Cliente;

public interface ClienteInterfaceRepository extends JpaRepository<Cliente,Integer> {

}
