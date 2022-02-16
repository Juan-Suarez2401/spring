package com.example.prueba.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "pacientes")
public class paciente {

    @Column(name = "Nombre_paciente")
    private String NombrePaciente;

    @Column(name = "Fecha_nacimiento")
    private LocalDateTime FechaNacimiento;

    private String Dirreccion;

    private String Identificacion;

    private Integer Telefono;

    public String getNombrePaciente() {
        return NombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        NombrePaciente = nombrePaciente;
    }

    public LocalDateTime getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public String getDirreccion() {
        return Dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        Dirreccion = dirreccion;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String identificacion) {
        Identificacion = identificacion;
    }

    public Integer getTelefono() {
        return Telefono;
    }

    public void setTelefono(Integer telefono) {
        Telefono = telefono;
    }
}
