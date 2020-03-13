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

import com.api.Entity.EntityBateria;
import com.api.Repository.BateriaRepository;
import com.api.Vehiculos.ApiVehiculo;
import com.api.model.Bateria;


//Anotación que indica a spring boot que es un controlador
@RestController
//Raiz de la dirección de la api
@RequestMapping("/api")
public class BateriaController {
	private static Logger LOG = LoggerFactory.getLogger(ApiVehiculo.class);
	@Autowired
	private BateriaRepository batrep;
	//Grabar
		@PostMapping("/bateria/grabar")
		public ResponseEntity<EntityBateria> createBateria( @RequestBody Bateria bat)
		{	
			LOG.info("Creating Bateria....");
			EntityBateria data = new EntityBateria(bat.getNombreBateria());
			EntityBateria bateriaGuardada = batrep.save(data);
			LOG.info("Created Bateria....");
			return  ResponseEntity.ok().body(bateriaGuardada);
		}
		//Lista Baterias
		@GetMapping("/baterias")
		public ResponseEntity<List<EntityBateria>> getallBaterias()
		{
			LOG.info("Loading Bateria....");
			List<EntityBateria> baterias = batrep.findAll();
			LOG.info("Loaded Bateria....");
			return ResponseEntity.ok().body(baterias);
		}
		//Lista Baterias por id
		@GetMapping("/bateria/{id}")
		public ResponseEntity<Optional<EntityBateria>> getBateriabyId(@PathVariable(value="id") int batId)
		{
			LOG.info("Loading Bateria....");
			Optional<EntityBateria> bat=batrep.findById(batId);
			LOG.info("Loaded Bateria....");
			return ResponseEntity.ok().body(bat);
			
		}
		//Modificar
		@PutMapping("/baterias/actualizar/{id}")
		public ResponseEntity<EntityBateria> updateBateria(@PathVariable(value="id") int batId,@Valid @RequestBody Bateria batDetails)
		{
			LOG.info("Updating Bateria....");
			Optional<EntityBateria> bat=batrep.findById(batId);
			bat.get().setNombreBateria(batDetails.getNombreBateria());
			EntityBateria bateriaActualizada = bat.get();
			EntityBateria actualizarBateria=batrep.save(bateriaActualizada);
			LOG.info("Updated Bateria....");
			return ResponseEntity.ok().body(actualizarBateria);
		}
		//Borrar
		@DeleteMapping("/bateria/borrar/{id}")
			public ResponseEntity<EntityBateria> borrarBateria(@PathVariable(value="id")int batid)
		{
			LOG.info("Deleting Bateria....");
			batrep.deleteById(batid);
			LOG.info("Deleted Bateria....");
			return ResponseEntity.ok().build();
		}
}
