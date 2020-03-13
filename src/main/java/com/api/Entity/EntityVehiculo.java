package com.api.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.api.model.Bateria;
import com.api.model.Motor;

@Entity
@Table(name="vehiculo")
public class EntityVehiculo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idVehiculo;
	@Column(name="modelo",nullable=false,length=50)	
	private String modelo;
	@Column(name="tipo_Vehiculo",nullable=false,length=50)	
	private String tipoVehiculo;
	  @ManyToOne
	  @JoinColumn(name = "id_motor_vehiculo")
	    private Motor motor;
	  @ManyToOne
	  @JoinColumn(name = "id_bateria_vehiculo")
	  private Bateria bateria;
	public int getIdVehiculo() {
		return idVehiculo;
	}
	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipoVehiculo() {
		return tipoVehiculo;
	}
	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Bateria getBateria() {
		return bateria;
	}
	public void setBateria(Bateria bateria) {
		this.bateria = bateria;
	}
	public EntityVehiculo(int idVehiculo, String modelo, String tipoVehiculo, Motor motor, Bateria bateria) {
		super();
		this.idVehiculo = idVehiculo;
		this.modelo = modelo;
		this.tipoVehiculo = tipoVehiculo;
		this.motor = motor;
		this.bateria = bateria;
	}
	public EntityVehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
