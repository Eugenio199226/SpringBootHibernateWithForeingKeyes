package com.api.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.api.Entity.EntityVehiculo;

public interface VehiculoRepository extends JpaRepository<EntityVehiculo, Integer> {

	public VehiculoRepository save(Optional<EntityVehiculo> veh);
}
