package com.api.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.Entity.EntityMotor;
import com.api.Repository.MotorRepository;
import com.api.Vehiculos.ApiVehiculo;
import com.api.model.Motor;

//Anotación que indica a spring boot que es un controlador
@RestController
//Raiz de la dirección de la api
@RequestMapping("/api")
public class MotorController {
	private static Logger LOG = LoggerFactory.getLogger(ApiVehiculo.class);
	@Autowired
	private MotorRepository motrep;
	//Grabar
		@PostMapping("/motor/grabar")
		public ResponseEntity<EntityMotor> createGenero( @RequestBody Motor mot)
		{	
			LOG.info("Creating Motor....");
			EntityMotor data = new EntityMotor(mot.getNombreMotor());
			EntityMotor motorGuardado = motrep.save(data);
			LOG.info("Created Motor....");
			return  ResponseEntity.ok().body(motorGuardado);
		}
		//Lista Motores
		@GetMapping("/motores")
		public ResponseEntity<List<EntityMotor>> getallMotores()
		{
			LOG.info("Loading Motor....");
			List<EntityMotor> motores = motrep.findAll();
			LOG.info("Loaded Motor....");
			return ResponseEntity.ok().body(motores);
		}
		//Lista Motores por id
		@GetMapping("/motores/{id}")
		public ResponseEntity<Optional<EntityMotor>> getMotorbyId(@PathVariable(value="id") int motId)
		{
			LOG.info("Loading Motor....");
			Optional<EntityMotor> mot=motrep.findById(motId);
			LOG.info("Loaded Motor....");
			return ResponseEntity.ok().body(mot);
			
			
		}
		//Modificar
		@PutMapping("/motores/actualizar/{id}")
		public ResponseEntity<EntityMotor> updateMotor(@PathVariable(value="id") int motId,@Valid @RequestBody Motor motDetails)
		{
			LOG.info("Updating Motor....");
			Optional<EntityMotor> mot=motrep.findById(motId);
			mot.get().setNombreMotor(motDetails.getNombreMotor());
			EntityMotor motorActualizado = mot.get();
			EntityMotor actualizarMotor=motrep.save(motorActualizado);
			LOG.info("Updated Motor....");
			return ResponseEntity.ok().body(actualizarMotor);
		}
		//Borrar
		@DeleteMapping("/motor/borrar/{id}")
			public ResponseEntity<EntityMotor> borrarMotor(@PathVariable(value="id")int motid)
		{
			LOG.info("Deleting Motor....");
			motrep.deleteById(motid);
			LOG.info("Deleted Motor....");
			return ResponseEntity.ok().build();
		}
}
