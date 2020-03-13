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

import com.api.Entity.EntityVehiculo;
import com.api.Repository.VehiculoRepository;
import com.api.Vehiculos.ApiVehiculo;
import com.api.model.Vehiculo;

//Anotación que indica a spring boot que es un controlador
@RestController
//Raiz de la dirección de la api
@RequestMapping("/api")
public class VehiculoController {
	private static Logger LOG = LoggerFactory.getLogger(ApiVehiculo.class);
	@Autowired
	private VehiculoRepository vehrep;
	//Grabar
	@PostMapping("/vehiculo/grabar")
	public ResponseEntity<EntityVehiculo> createVehiculo( @RequestBody Vehiculo veh)
	{	
		LOG.info("Creating vehiculo....");
		EntityVehiculo data = new EntityVehiculo(veh.getModelo(),veh.getTipoVehiculo(),veh.getIdmotor(),veh.getIdbateria());
		EntityVehiculo vehiculoGuardado = vehrep.save(data);
		LOG.info("Created vehiculo....");
		return  ResponseEntity.ok().body(vehiculoGuardado);
	}
	//Lista vehiculos
			@GetMapping("/vehiculos")
			public ResponseEntity<List<EntityVehiculo>> getallVehiculos()
			{
				LOG.info("Loading vehiculo....");
				List<EntityVehiculo> vehiculos = vehrep.findAll();
				LOG.info("Loaded vehiculo....");
				return ResponseEntity.ok().body(vehiculos);
			}
			//Lista vehiculos por id
			@GetMapping("/vehiculos/{id}")
			public ResponseEntity<Optional<EntityVehiculo>> getVehiculobyId(@PathVariable(value="id") int vehId)
			{
				LOG.info("Loading vehiculo....");
				Optional<EntityVehiculo> veh=vehrep.findById(vehId);
				LOG.info("Loaded vehiculo....");
				return ResponseEntity.ok().body(veh);
				
				
			}
			//Modificar
			@PutMapping("/vehiculos/actualizar/{id}")
			public ResponseEntity<EntityVehiculo> updateMotor(@PathVariable(value="id") int vehId,@Valid @RequestBody Vehiculo vehDetails)
			{
				LOG.info("Updating vehiculo....");
				Optional<EntityVehiculo> veh=vehrep.findById(vehId);
				veh.get().setModelo(vehDetails.getModelo());
				veh.get().setTipoVehiculo(vehDetails.getTipoVehiculo());
				veh.get().setIdmotor(vehDetails.getIdmotor());
				veh.get().setIdVehiculo(vehDetails.getIdVehiculo());
				EntityVehiculo vehiculoActualizado = veh.get();
				EntityVehiculo actualizarVehiculo=vehrep.save(vehiculoActualizado);
				LOG.info("Updated vehiculo....");
				return ResponseEntity.ok().body(actualizarVehiculo);
			}
			//Borrar
			@DeleteMapping("/vehiculo/borrar/{id}")
				public ResponseEntity<EntityVehiculo> borrarMotor(@PathVariable(value="id")int vehid)
			{
				LOG.info("Deleting vehiculo....");
				vehrep.deleteById(vehid);
				LOG.info("Deleted vehiculo....");
				return ResponseEntity.ok().build();
			}

}
