package com.api.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="motor")
public class EntityMotor {
	//Variables
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idmotor;
	@Column(name="nombre_motor",nullable=false,length=50)	
	private String nombreMotor;
	public int getIdmotor() {
		return idmotor;
	}
	public void setIdmotor(int idmotor) {
		this.idmotor = idmotor;
	}
	public String getNombreMotor() {
		return nombreMotor;
	}
	public void setNombreMotor(String nombreMotor) {
		this.nombreMotor = nombreMotor;
	}
	public EntityMotor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EntityMotor(int idmotor, String nombreMotor) {
		super();
		this.idmotor = idmotor;
		this.nombreMotor = nombreMotor;
	}
	
}
