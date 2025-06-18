package com.mx.aerolinea.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vuelo")
public class Vuelo {

    @Id
    private int idVuelo;
    private String reservaEnLinea;
    private String checkIn;
    private String tipoClase;
    private String servicioAbordo;


    public Vuelo(){}


    public Vuelo(int idVuelo, String reservaEnLinea, String checkIn, String tipoClase, String servicioAbordo) {
        this.idVuelo = idVuelo;
        this.reservaEnLinea = reservaEnLinea;
        this.checkIn = checkIn;
        this.tipoClase = tipoClase;
        this.servicioAbordo = servicioAbordo;
    }


    public int getIdVuelo() {
        return idVuelo;
    }


    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }


    public String getReservaEnLinea() {
        return reservaEnLinea;
    }


    public void setReservaEnLinea(String reservaEnLinea) {
        this.reservaEnLinea = reservaEnLinea;
    }


    public String getCheckIn() {
        return checkIn;
    }


    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }


    public String getTipoClase() {
        return tipoClase;
    }


    public void setTipoClase(String tipoClase) {
        this.tipoClase = tipoClase;
    }


    public String getServicioAbordo() {
        return servicioAbordo;
    }


    public void setServicioAbordo(String servicioAbordo) {
        this.servicioAbordo = servicioAbordo;
    }


    
    





}
