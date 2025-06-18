package com.mx.aerolinea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.aerolinea.model.Domicilio;
import com.mx.aerolinea.repository.DomicilioInterfaceRepository;

@Service
public class DomicilioServiceImpl implements DomicilioInterfaceService {

    @Autowired
    DomicilioInterfaceRepository repository;

    @Override
    public Domicilio crearDomicilio(Domicilio domicilio) {
        Domicilio result = null;
        try {
            result = repository.save(domicilio);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    @Override
    public List<Domicilio> buscarDomicilio() {
        List<Domicilio> resultado = null;
        try {
            resultado = repository.findAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }

    @Override
    public Domicilio actualizarDomicilio(Domicilio domicilio, int idDomicilio) {
        Domicilio guardar = new Domicilio();
        try {
            boolean recuperado = repository.existsById(idDomicilio);
            if (recuperado == true) {
                guardar.setIdDomicilio(idDomicilio);
                guardar.setCalle(domicilio.getCalle());
                guardar.setNumero(domicilio.getNumero());
                guardar.setCodigoPostal(domicilio.getCodigoPostal());
                guardar.setColonia(domicilio.getColonia());
                guardar.setMunicipio(domicilio.getMunicipio());
                guardar.setEstado(domicilio.getEstado());
                guardar.setCiudad(domicilio.getCiudad());
                guardar.setReferncias(domicilio.getReferencias());
                guardar = repository.save(guardar);

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return guardar;
    }

    @Override
    public void eliminarDomicilio(long idDomicilio) {
        int id = (int) idDomicilio;
        try {
            repository.deleteById(id);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
