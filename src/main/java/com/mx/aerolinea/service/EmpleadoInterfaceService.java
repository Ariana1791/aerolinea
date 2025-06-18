package com.mx.aerolinea.service;

import java.util.List;

import com.mx.aerolinea.model.Empleado;


public interface EmpleadoInterfaceService {

Empleado crearEmpleado(Empleado empleado);
List<Empleado> buscarEmpleado();
Empleado actualizarEmpleado(Empleado empleado, int idEmpleado);
void eliminarEmpleado(long idEmpleado);

}
