package com.brassonero.evaluacion.model.repository;

import com.brassonero.evaluacion.model.entity.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreguntaRepository extends JpaRepository<Pregunta, Long> {
}
