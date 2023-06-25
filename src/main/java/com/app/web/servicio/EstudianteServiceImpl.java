package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Estudiante;
import com.app.web.repositorio.EstudianteRepositorio;

@Service
public class EstudianteServiceImpl implements EstudianteServicio {

	@Autowired
	private EstudianteRepositorio estudianteRepositorio;

	@Override
	public List<Estudiante> listarEstudiantes() {
		return estudianteRepositorio.findAll();
	}

	@Override
	public Estudiante crearEstudiante(Estudiante estudiante) {
		return estudianteRepositorio.save(estudiante);
	}

	@Override
	public Estudiante obtenerEstudiantePorId(Long id) {
		return estudianteRepositorio.findById(id).get();
	}

	@Override
	public Estudiante actualizarEstudiante(Estudiante estudiante) {
		return estudianteRepositorio.save(estudiante);
	}

	@Override
	public void eliminarEstudiante(Long id) {
		estudianteRepositorio.deleteById(id);
	}

}
