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

import com.mx.aerolinea.model.Vuelo;
import com.mx.aerolinea.service.VueloInterfaceService;

@RestController
public class VueloController {

    @Autowired
    VueloInterfaceService service;

    @PostMapping(value = "/guardarVuelo")
    public Vuelo crearVuelo(@RequestBody Vuelo vuelo) {
        Vuelo crear = null;
        try {
            crear = service.crearVuelo(vuelo);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return crear;
    }

    @GetMapping(value = "/buscarVuelo")
    public List<Vuelo> buscarVuelo() {
        List<Vuelo> buscar = null;
        try {
            buscar = service.buscarVuelo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return buscar;
    }

    @PutMapping(value = "/actualizarVuelo/{idVuelo}")
    public Vuelo actualizarVuelo(@RequestBody Vuelo vuelo, @PathVariable int idVuelo) {
        Vuelo actualizar = null;
        try {
            actualizar = service.actualizarVuelo(vuelo, idVuelo);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return actualizar;
    }

    @DeleteMapping(value = "/eliminarVuelo/{idVuelo}")
    public void eliminarVuelo(@PathVariable long idVuelo) {

        try {
            service.eliminarVuelo(idVuelo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
