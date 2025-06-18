package com.mx.aerolinea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.aerolinea.model.Vuelo;
import com.mx.aerolinea.repository.VueloInterfaceRepository;

@Service
public class VueloServiceImpl implements VueloInterfaceService {

    @Autowired
    VueloInterfaceRepository repository;

    @Override
    public Vuelo crearVuelo(Vuelo vuelo) {
        Vuelo result = null;
        try {
            result = repository.save(vuelo);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    @Override
    public List<Vuelo> buscarVuelo() {
        List<Vuelo> resultado = null;
        try {
            resultado = repository.findAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }

    @Override
    public Vuelo actualizarVuelo(Vuelo vuelo, int idVuelo) {
        Vuelo guardar = new Vuelo();
        try {
            boolean recuperado = repository.existsById(idVuelo);
            if (recuperado == true) {
                guardar.setIdVuelo(idVuelo);
                guardar.setReservaEnLinea(vuelo.getReservaEnLinea());
                guardar.setCheckIn(vuelo.getCheckIn());
                guardar.setTipoClase(vuelo.getTipoClase());
                guardar.setServicioAbordo(vuelo.getServicioAbordo());
                guardar = repository.save(guardar);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return guardar;
    }

    @Override
    public void eliminarVuelo(long idVuelo) {

        int id = (int) idVuelo;
        try {
            repository.deleteById(id);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
