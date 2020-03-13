package com.api.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.Entity.EntityBateria;

public interface BateriaRepository extends JpaRepository<EntityBateria, Integer> {
	 public BateriaRepository save(Optional<EntityBateria> bat);
}
