package com.ecoleo.models.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name ="usuarios")
public class Clientes {
    @Id
    Long id;
    String nombre;
    String apellido;
    String direccion;
    String email;
    String genero;
    String edad;
    int celular;
    int telefono;
    int segmentoId;
}
