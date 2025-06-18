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

import com.mx.aerolinea.model.Avion;
import com.mx.aerolinea.service.AvionInterfaceService;

@RestController
public class AvionController {

    @Autowired
    AvionInterfaceService service;

    @PostMapping(value = "/guardarAvion")
    public Avion crearAvion(@RequestBody Avion avion) {
        Avion crear = null;
        try {
            crear = service.crearAvion(avion);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return crear;
    }

    @GetMapping(value = "/buscarAvion")
    public List<Avion> buscarAvion() {
        List<Avion> buscar = null;
        try {
            buscar = service.buscarAvion();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return buscar;
    }

    @PutMapping(value = "/actualizarAvion/{idAvion}")
    public Avion actualizarAvion(@RequestBody Avion avion,@PathVariable int idAvion) {
        Avion actualizar = null;
        try {
            actualizar = service.actualizarAvion(avion, idAvion);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return actualizar;
    }

    @DeleteMapping(value = "/eliminarAvion/{idAvion}")
    public void eliminarAvion(@PathVariable long idAvion) {

        try {
            service.eliminarAvion(idAvion);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
