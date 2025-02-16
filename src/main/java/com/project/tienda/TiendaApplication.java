package com.project.tienda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.tienda.entidad.Estudiante;
import com.project.tienda.repositorio.EstudianteRepositorio;

@SpringBootApplication
public class TiendaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TiendaApplication.class, args);
	}

	@Autowired
	private EstudianteRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {
		Estudiante estudiante1 = new Estudiante("Sebastian", "Quispe", "se_edu@hotmail.com");
		repositorio.save(estudiante1);

		Estudiante estudiante2 = new Estudiante("Daniela", "Meneses", "daniela@hotmail.com");
		repositorio.save(estudiante2);
	}

}
