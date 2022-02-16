package com.example.prueba.persistence.entity;

import javax.persistence.*;


@Entity
@Table(name= "citas")

public class Citas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "Nombre_paciente")
    private String NombrePaciente;

    private Integer celular;

    @Column(name = "tipo_cita")
    private String TipoCita;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNombrePaciente() {
        return NombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        NombrePaciente = nombrePaciente;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public String getTipoCita() {
        return TipoCita;
    }

    public void setTipoCita(String tipoCita) {
        TipoCita = tipoCita;
    }
}
