package com.mx.aerolinea.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {

    @Id
    private int idEmpleado;  
    private String nombre;
    private String tipoEmpleado;
    private String sexo;
    private String curp;
    private String correo;
    private long seguro;
    private long  telefono;
    private String domicilio;


    public Empleado(){}


    public Empleado(int idEmpleado, String nombre, String tipoEmpleado, String sexo, String curp, String correo,
            long seguro, long  telefono, String domicilio) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.tipoEmpleado = tipoEmpleado;
        this.sexo = sexo;
        this.curp = curp;
        this.correo = correo;
        this.seguro = seguro;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }


    public int getIdEmpleado() {
        return idEmpleado;
    }


    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getTipoEmpleado() {
        return tipoEmpleado;
    }


    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }


    public String getSexo() {
        return sexo;
    }


    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public String getCurp() {
        return curp;
    }


    public void setCurp(String curp) {
        this.curp = curp;
    }


    public String getCorreo() {
        return correo;
    }


    public void setCorreo(String correo) {
        this.correo = correo;
    }


    public long getSeguro() {
        return seguro;
    }


    public void setSeguro(long seguro) {
        this.seguro = seguro;
    }


    public long  getTelefono() {
        return telefono;
    }


    public void setTelefono(long  telefono) {
        this.telefono = telefono;
    }


    public String getDomicilio() {
        return domicilio;
    }


    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }




}
