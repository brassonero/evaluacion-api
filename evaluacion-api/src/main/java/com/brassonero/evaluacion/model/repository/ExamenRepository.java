package com.brassonero.evaluacion.model.repository;

import com.brassonero.evaluacion.model.entity.Examen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamenRepository extends JpaRepository<Examen, Long> {
}
