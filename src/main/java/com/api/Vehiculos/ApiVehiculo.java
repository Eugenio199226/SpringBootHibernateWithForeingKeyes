package com.api.Vehiculos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.api.controller.BateriaController;
import com.api.Repository.BateriaRepository;
import com.api.Entity.EntityBateria;


//Clase de arranque para boot spring
@SpringBootApplication
//Se define la ubicación del controlador
@ComponentScan(basePackageClasses=BateriaController.class)
//Se define la ubicación de la clase repositorio
@EnableJpaRepositories(basePackageClasses=BateriaRepository.class)
//Se define la ubicación de la clase entity
@EntityScan(basePackageClasses=EntityBateria.class)

public class ApiVehiculo {

	public static void main(String[] args) {
		SpringApplication.run(ApiVehiculo.class, args);
	}

}
