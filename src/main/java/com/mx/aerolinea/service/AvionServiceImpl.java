package com.mx.aerolinea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.aerolinea.model.Avion;
import com.mx.aerolinea.repository.AvionInterfaceRepository;

@Service
public class AvionServiceImpl implements AvionInterfaceService{

@Autowired 
AvionInterfaceRepository  repository; 

    @Override
    public Avion crearAvion(Avion avion) {
        Avion result = new Avion();
    try {
        result = repository.save(avion);
        
    }catch (Exception e){
        System.out.println(e.getMessage());
    }
    return result;
    }

    @Override
    public List<Avion> buscarAvion() {
        List<Avion> resultado = null;
     try{
        resultado = repository.findAll();
    }catch (Exception e){
        System.out.println(e.getMessage());
    }
    return resultado;
    }

    @Override
    public Avion actualizarAvion(Avion avion, int idAvion) {
        Avion guardar = new Avion();
    try{
        boolean recuperado = repository.existsById(idAvion);
        if(recuperado == true){
           guardar.setIdAvion(idAvion);
           guardar.setCapacidad(avion.getCapacidad());
           guardar.setDistancia(avion.getDistancia());
           guardar.setFuselaje(avion.getFuselaje());
           guardar.setMateriales(avion.getMateriales());
           guardar.setTipoCombustible(avion.getTipoCombustible());
           guardar = repository.save(guardar);



        }
        
    } catch (Exception e){
System.out.println(e.getMessage());

    }
    return guardar;
    }

    @Override
    public void eliminarAvion(long idAvion) {
        int id = (int) idAvion;
     try{
          repository.deleteById(id);

     } catch (Exception e){
System.out.println(e.getMessage());
     }
    }

}
