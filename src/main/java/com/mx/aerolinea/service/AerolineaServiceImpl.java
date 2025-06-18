package com.mx.aerolinea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.aerolinea.model.Boleto;
import com.mx.aerolinea.repository.AerolineaInterfaceRepository;

@Service
public class AerolineaServiceImpl implements AerolineaInterfaceService{

@Autowired
AerolineaInterfaceRepository repository;

@Override
public Boleto crearBoleto(Boleto boleto) {
   Boleto result = null;
   try {
    result = repository.save(boleto);
    
   } catch (Exception e) {
System.out.println(e.getMessage());
   } 
   return result;
}

@Override
public List<Boleto> buscarBoleto() {

    List<Boleto> resultado = null;
    try{
      resultado = repository.findAll();  
    } catch (Exception e){
System.out.println(e.getMessage());

    }
    return resultado;
}

@Override
public Boleto actualizarBoleto(Boleto boleto, int idBoleto) {
    Boleto guardar = new Boleto();
    try{
        boolean recuperado = repository.existsById(idBoleto);
        if (recuperado == true){
            guardar.setIdBoleto(idBoleto);
            guardar.setNombre(boleto.getNombre());
            guardar.setDestino(boleto.getDestino());
            guardar.setHoraSalida(boleto.getHoraSalida());
            guardar.setNumeroAsiento(boleto.getNumeroAsiento());
            guardar.setFecha(boleto.getFecha());
            guardar = repository.save(guardar);

        }
        
    } catch (Exception e){
System.out.println(e.getMessage());

    }
    return guardar;
}

@Override
public void eliminarBoleto(long idBoleto) {

     int id = (int) idBoleto;
     try{
          repository.deleteById(id);

     } catch (Exception e){
System.out.println(e.getMessage());
     }
     
}
}
