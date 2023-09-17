package com.ecoleo.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name="aceites")
public class Aceites {

    @Id
    Long id;
    @Column(name = "tipo")
    String tipoAceite;
    int cantidad;
    int codigo;
    int clienteId;
    @Column(name = "fecha_recoleccion")
    String email;
    @JsonFormat(pattern = "dd/MM/yyyy")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    Date fechaRecolección;

}
