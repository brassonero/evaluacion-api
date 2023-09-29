package com.brassonero.evaluacion.service;

import com.brassonero.evaluacion.model.dto.*;

import java.util.List;

public interface IExamenService {
    ExamenResponse crearExamen(ExamenRequest request);

    EstudianteResponse crearEstudiante(EstudianteRequest request);

    AsignacionResponse asignarExamen(Long idEstudiante, Long idExamen);

    void guardarRespuestas(Long idEstudiante, Long idExamen, List<Long> idOpciones);

    CalificacionResponse calcularPuntaje(Long idEstudiante, Long idExamen);
}
