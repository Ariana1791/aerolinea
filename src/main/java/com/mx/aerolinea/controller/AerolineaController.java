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

import com.mx.aerolinea.model.Boleto;
import com.mx.aerolinea.service.AerolineaInterfaceService;

@RestController
public class AerolineaController {

    @Autowired
    AerolineaInterfaceService service;

    @PostMapping(value = "/guardarBoleto")
    public Boleto crearBoleto(@RequestBody Boleto boleto) {
        Boleto crear = null;
        try {
            crear = service.crearBoleto(boleto);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return crear;
    }

    @GetMapping(value = "/buscarBoleto")
    public List<Boleto> buscarBoleto() {
        List<Boleto> buscar = null;
        try {
            buscar = service.buscarBoleto();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return buscar;
    }

    @PutMapping(value = "/actualizarBoleto/{idBoleto}")
    public Boleto actualizarBoleto(@RequestBody Boleto boleto, @PathVariable int idBoleto) {
        Boleto actualizar = null;
        try {
            actualizar = service.actualizarBoleto(boleto, idBoleto);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return actualizar;
    }

    @DeleteMapping(value = "/eliminarBoleto/{idBoleto}")
    public void eliminarBoleto(@PathVariable long idBoleto) {

        try {
            service.eliminarBoleto(idBoleto);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
