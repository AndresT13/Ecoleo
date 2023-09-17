package com.ecoleo.models.dao;

import com.ecoleo.models.dto.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientes extends JpaRepository<Long, Clientes> {
}
