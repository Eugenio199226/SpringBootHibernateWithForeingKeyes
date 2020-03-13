package com.api.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.Entity.EntityMotor;

@Repository
public interface MotorRepository  extends JpaRepository<EntityMotor, Integer> {
	public MotorRepository save(Optional<EntityMotor> mot);
}
