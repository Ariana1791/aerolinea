package com.mx.aerolinea.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "avion")
public class Avion {

    @Id
    private int idAvion;
    private int capacidad;
    private float distancia;
    private String fuselaje;
    private String materiales;
    private String tipoCombustible;

    public Avion(){}

    public Avion(int idAvion, int capacidad, float distancia, String fuselaje, String materiales,
            String tipoCombustible) {
        this.idAvion = idAvion;
        this.capacidad = capacidad;
        this.distancia = distancia;
        this.fuselaje = fuselaje;
        this.materiales = materiales;
        this.tipoCombustible = tipoCombustible;
    }

    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public String getFuselaje() {
        return fuselaje;
    }

    public void setFuselaje(String fuselaje) {
        this.fuselaje = fuselaje;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    

    
}
