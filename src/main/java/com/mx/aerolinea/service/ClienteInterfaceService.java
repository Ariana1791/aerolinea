package com.mx.aerolinea.service;

import java.util.List;

import com.mx.aerolinea.model.Cliente;

public interface ClienteInterfaceService {

    Cliente crearCliente(Cliente cliente);
    List<Cliente> buscarCliente();
    Cliente actualizarCliente(Cliente cliente, int idCliente);
    void eliminarCliente (long idCliente);


}
