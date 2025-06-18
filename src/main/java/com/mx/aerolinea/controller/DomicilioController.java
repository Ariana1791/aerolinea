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

import com.mx.aerolinea.model.Domicilio;
import com.mx.aerolinea.service.DomicilioInterfaceService;

@RestController
public class DomicilioController {

    @Autowired
    DomicilioInterfaceService service;

    @PostMapping(value = "/guardarDomicilio")
    public Domicilio crearDomicilio(@RequestBody Domicilio domicilio) {
        Domicilio crear = null;
        try {
            crear = service.crearDomicilio(domicilio);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return crear;
    }

    @GetMapping(value = "/buscarDomicilio")
    public List<Domicilio> buscarDomicio() {
        List<Domicilio> buscar = null;
        try {
            buscar = service.buscarDomicilio();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return buscar;
    }

    @PutMapping(value = "/actualizarDomicilio/{idDomicilio}")
    public Domicilio actualizarDomicilio(@RequestBody Domicilio domicilio, @PathVariable int idDomicilio) {
        Domicilio actualizar = null;
        try {
            actualizar = service.actualizarDomicilio(domicilio, idDomicilio);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return actualizar;
    }

    @DeleteMapping(value = "/eliminarDomicilio/{idDomicilio}")
    public void eliminarDomicilio(@PathVariable long idDomicilio) {

        try {
            service.eliminarDomicilio(idDomicilio);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
