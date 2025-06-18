package com.mx.aerolinea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.aerolinea.model.Empleado;
import com.mx.aerolinea.repository.EmpleadoInterfaceRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoInterfaceService{


@Autowired
EmpleadoInterfaceRepository repository;

    @Override
    public Empleado crearEmpleado(Empleado empleado) {
    
        Empleado result = null;
    try {
        result = repository.save(empleado);
        
    }catch (Exception e){
        System.out.println(e.getMessage());
    }
    return result;
    }  

    @Override
    public List<Empleado> buscarEmpleado() {
       List<Empleado> resultado = null;
     try{
        resultado = repository.findAll();
    }catch (Exception e){
        System.out.println(e.getMessage());
    }
    return resultado;
    }

    @Override
    public Empleado actualizarEmpleado(Empleado empleado, int idEmpleado) {
        Empleado guardar = new Empleado();
    try{
        boolean recuperado = repository.existsById(idEmpleado);
        if (recuperado == true){
            guardar.setIdEmpleado(idEmpleado);
            guardar.setNombre(empleado.getNombre());
            guardar.setTipoEmpleado(empleado.getTipoEmpleado());
            guardar.setSexo(empleado.getSexo());
            guardar.setCurp(empleado.getCurp());
            guardar.setCorreo(empleado.getCorreo());
            guardar.setSeguro(empleado.getSeguro());
            guardar.setTelefono(empleado.getTelefono());
            guardar.setDomicilio(empleado.getDomicilio());
            guardar = repository.save(guardar);
        }
        
    } catch (Exception e){
         System.out.println(e.getMessage());

    }
    return guardar;
    }


    @Override
    public void eliminarEmpleado(long idEmpleado) {
        int id = (int) idEmpleado;
     try{
          repository.deleteById(id);

     } catch (Exception e){
       System.out.println(e.getMessage());
     }
    }
}
