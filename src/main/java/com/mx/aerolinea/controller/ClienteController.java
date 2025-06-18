package com.mx.aerolinea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mx.aerolinea.model.Cliente;
import com.mx.aerolinea.service.ClienteInterfaceService;

@RestController
public class ClienteController {

    @Autowired
    ClienteInterfaceService service;

    @PostMapping(value = "/guardarCliente")
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        Cliente crear = null;
        try {
            crear = service.crearCliente(cliente);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return crear;
    }

    @GetMapping(value = "/buscarCliente")
    public List<Cliente> buscarCliente() {
        List<Cliente> buscar = null;
        try {
            buscar = service.buscarCliente();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return buscar;
    }

    @PutMapping(value = "/actualizarCliente/{idCliente}")
    public Cliente actualizarCliente(@RequestBody Cliente cliente, @PathVariable int idCliente) {
        Cliente actualizar = null;
        try {
            actualizar = service.actualizarCliente(cliente, idCliente);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return actualizar;
    }

    @DeleteMapping(value = "/eliminarCliente/{idCliente}")
    public void eliminarCliente(@PathVariable long idCliente) {

        try {
            service.eliminarCliente(idCliente);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
