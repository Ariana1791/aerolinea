package com.mx.aerolinea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.aerolinea.model.Cliente;
import com.mx.aerolinea.repository.ClienteInterfaceRepository;

@Service
public class ClienteServiceImpl implements ClienteInterfaceService {

    @Autowired
    ClienteInterfaceRepository repository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        Cliente result = null;
        try {
            result = repository.save(cliente);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    @Override
    public List<Cliente> buscarCliente() {
        List<Cliente> resultado = null;
        try {
            resultado = repository.findAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }

    @Override
    public Cliente actualizarCliente(Cliente cliente, int idCliente) {
        Cliente guardar = new Cliente();
        try {
                boolean recuperado = repository.existsById(idCliente);
                if (recuperado == true) {
                    guardar.setIdCliente(idCliente);
                    guardar.setTipoCliente(cliente.getTipoCliente());
                    guardar.setUsuario(cliente.getUsuario());
                    guardar.setContraseña(cliente.getContraseña());
                    guardar.setCurp(cliente.getCurp());
                    guardar.setRfc(cliente.getRfc());
                    guardar.setDomicilio(cliente.getDomicilio());
                    guardar = repository.save(guardar);
                }
                
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
            return guardar;
        }

        @Override
        public void eliminarCliente(long idCliente)
         {
        int id = (int) idCliente;
            try {
                repository.deleteById(id);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
