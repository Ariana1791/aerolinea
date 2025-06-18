package com.mx.aerolinea.service;

import java.util.List;

import com.mx.aerolinea.model.Vuelo;

public interface VueloInterfaceService {


    Vuelo crearVuelo(Vuelo vuelo);
    List<Vuelo> buscarVuelo();
    Vuelo actualizarVuelo(Vuelo vuelo, int idVuelo);
    void eliminarVuelo (long idVuelo);

}
