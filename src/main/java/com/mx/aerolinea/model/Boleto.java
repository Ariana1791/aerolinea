package com.mx.aerolinea.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "boleto")
public class Boleto {
    @Id
    private int idBoleto;
    private String nombre;
    private String destino;
    private int horaSalida;
    private int numeroAsiento;
    private Date fecha; 

    public Boleto(){}
    
    public Boleto (int idBoleto, String nombre, String destino, int horaSalida, int numeroAsiento, Date fecha){
       this.idBoleto = idBoleto;
       this.nombre = nombre;
       this.destino = destino;
       this.horaSalida = horaSalida;
       this.numeroAsiento = numeroAsiento;
       this.fecha = fecha;
}


    public int getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(int idBoleto) {
        this.idBoleto = idBoleto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


}



