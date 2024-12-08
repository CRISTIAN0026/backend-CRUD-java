package com.example.hospital.model;

import jakarta.persistence.*;

@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    private Long empleadoId;
    private String nombre;
    private String direccion;
    private String telefono;
    private String poblacion;
    private String provincia;
    private String codigoPostal;
    private String nif;
    private String numSeguridadSocial;
    private String tipoEmpleado;  // "medico", "ats", etc.
    private String categoriaLaboral;  // "titular", "interino", etc.

    // Getters y setters
    public Long getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(Long empleadoId) {
        this.empleadoId = empleadoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Otros getters y setters...

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getCategoriaLaboral() {
        return categoriaLaboral;
    }

    public void setCategoriaLaboral(String categoriaLaboral) {
        this.categoriaLaboral = categoriaLaboral;
    }
}

