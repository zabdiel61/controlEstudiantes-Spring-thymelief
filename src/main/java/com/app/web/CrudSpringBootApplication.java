package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entidad.Estudiante;
import com.app.web.repositorio.EstudianteRepositorio;

@SpringBootApplication
public class CrudSpringBootApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringBootApplication.class, args);
	}
	
	@Autowired
	private EstudianteRepositorio estudianteRepositorio;

	@Override
	public void run(String... args) throws Exception {
//		Estudiante estudiante = new Estudiante("Zabdiel", "Hernandez", "jonathan@gmail.com");
//		estudianteRepositorio.save(estudiante);
//		Estudiante estudiante1 = new Estudiante("Jonathan", "Albayero", "alba@mail.com");
//		estudianteRepositorio.save(estudiante1);
	}

}
