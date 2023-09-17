package com.ecoleo.models.dao;

import com.ecoleo.models.dto.Aceites;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAceites extends JpaRepository<Long, Aceites> {
}
