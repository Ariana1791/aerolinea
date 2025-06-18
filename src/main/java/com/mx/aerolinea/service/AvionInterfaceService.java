package com.mx.aerolinea.service;

import java.util.List;

import com.mx.aerolinea.model.Avion;

public interface AvionInterfaceService {

    
Avion crearAvion(Avion avion);
List<Avion> buscarAvion();
Avion actualizarAvion(Avion avion, int idCliente);
void eliminarAvion(long idAvion);


}
