package com.api.model;

public class Vehiculo {
	private int idVehiculo;
	private String modelo;
	private String tipoVehiculo;
	private Motor motor;
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
	public Vehiculo(int idVehiculo, String modelo, String tipoVehiculo, Motor motor, Bateria bateria) {
		super();
		this.idVehiculo = idVehiculo;
		this.modelo = modelo;
		this.tipoVehiculo = tipoVehiculo;
		this.motor = motor;
		this.bateria = bateria;
	}
	public Vehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
