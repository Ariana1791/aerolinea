package com.mx.aerolinea.service;

import java.util.List;

import com.mx.aerolinea.model.Domicilio;

public interface DomicilioInterfaceService {


    Domicilio crearDomicilio(Domicilio domicilio);
List<Domicilio> buscarDomicilio();
Domicilio actualizarDomicilio(Domicilio domicilio, int idDomicilio);
void eliminarDomicilio(long idDomicilio);

}
