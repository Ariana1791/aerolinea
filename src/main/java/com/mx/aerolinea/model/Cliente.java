package com.mx.aerolinea.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    private int idCliente;
    private String tipoCliente;
    private String usuario;
    private String contraseña;
    private String curp;
    private String rfc;
    private String domicilio;


    
    public Cliente(){}


    public Cliente(int idCliente, String tipoCliente, String usuario, String contraseña, String curp, String rfc,
        String domicilio) {
        this.idCliente = idCliente;
        this.tipoCliente = tipoCliente;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.curp = curp;
        this.rfc = rfc;
        this.domicilio = domicilio;
    }
    
    public int getIdCliente() {
        return idCliente;
    }


    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }


    public String getTipoCliente() {
        return tipoCliente;
    }


    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }


    public String getUsuario() {
        return usuario;
    }



    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }



    public String getContraseña() {
        return contraseña;
    }



    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }



    public String getCurp() {
        return curp;
    }



    public void setCurp(String curp) {
        this.curp = curp;
    }



    public String getRfc() {
        return rfc;
    }



    public void setRfc(String rfc) {
        this.rfc = rfc;
    }



    public String getDomicilio() {
        return domicilio;
    }



    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }





    


}
