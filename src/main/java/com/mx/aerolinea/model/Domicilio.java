package com.mx.aerolinea.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "domicilio")
public class Domicilio {

    @Id
    private int idDomicilio;
    private String calle;
    private int numero;
    private int   codigoPostal;
    private String colonia;
    private String municipio;
    private String estado;
    private String ciudad;
    private String referencias;


    public Domicilio(){}
    

    public Domicilio(int idDomicilio, String calle, int numero, int   codigoPostal, String colonia, String municipio,
            String estado, String ciudad, String referencias) {
        this.idDomicilio = idDomicilio;
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
        this.colonia = colonia;
        this.municipio = municipio;
        this.estado = estado;
        this.ciudad = ciudad;
        this.referencias = referencias;
    }

    public int getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(int idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int  getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int   codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferncias(String referencias) {
        this.referencias = referencias;
    }

    

    
}
