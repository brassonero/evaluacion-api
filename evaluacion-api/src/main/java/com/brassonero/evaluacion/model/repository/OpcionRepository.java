package com.brassonero.evaluacion.model.repository;

import com.brassonero.evaluacion.model.entity.Opcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpcionRepository extends JpaRepository<Opcion, Long> {
}
