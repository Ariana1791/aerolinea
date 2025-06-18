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

import com.mx.aerolinea.model.Empleado;
import com.mx.aerolinea.service.EmpleadoInterfaceService;

@RestController
public class EmpleadoController {

    @Autowired
    EmpleadoInterfaceService service;

    @PostMapping(value = "/guardarEmpleado")
    public Empleado crearEmpleado(@RequestBody Empleado empleado) {
        Empleado crear = null;
        try {
            crear = service.crearEmpleado(empleado);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return crear;
    }

    @GetMapping(value = "/buscarEmpleado")
    public List<Empleado> buscarEmpleado() {
        List<Empleado> buscar = null;
        try {
            buscar = service.buscarEmpleado();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return buscar;
    }

    @PutMapping(value = "/actualizarEmpleado/{idEmpleado}")
    public Empleado actualizarEmpleado(@RequestBody Empleado empleado, @PathVariable int idEmpleado) {
        Empleado actualizar = null;
        try {
            actualizar = service.actualizarEmpleado(empleado, idEmpleado);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return actualizar;
    }

    @DeleteMapping(value = "/eliminarEmpleado/{idEmpleado}")
    public void eliminarEmpleado(@PathVariable long idEmpleado) {

        try {
            service.eliminarEmpleado(idEmpleado);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
