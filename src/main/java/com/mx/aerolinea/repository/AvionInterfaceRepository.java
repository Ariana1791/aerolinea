package com.mx.aerolinea.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.aerolinea.model.Avion;

public interface AvionInterfaceRepository extends JpaRepository<Avion,Integer>{

}
