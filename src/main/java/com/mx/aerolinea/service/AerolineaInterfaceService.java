package com.mx.aerolinea.service;

import java.util.List;

import com.mx.aerolinea.model.Boleto;

public interface AerolineaInterfaceService {


    Boleto crearBoleto(Boleto boleto);
    List<Boleto> buscarBoleto();
    Boleto actualizarBoleto(Boleto boleto, int idBoleto);
    void eliminarBoleto(long idBoleto);


}
