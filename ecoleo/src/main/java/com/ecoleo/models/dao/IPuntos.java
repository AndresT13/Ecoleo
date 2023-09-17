package com.ecoleo.models.dao;

import com.ecoleo.models.dto.Puntos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPuntos extends JpaRepository<Long, Puntos> {
}
