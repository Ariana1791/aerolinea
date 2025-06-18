package com.mx.aerolinea.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.aerolinea.model.Vuelo;

public interface VueloInterfaceRepository  extends JpaRepository<Vuelo,Integer>{

}
