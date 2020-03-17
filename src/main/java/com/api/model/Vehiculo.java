package com.api.model;


public class Vehiculo {
	private int idVehiculo;
	private String modelo;
	private String tipoVehiculo;
	private int idbateria;
	private int idmotor;
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
	public int getIdbateria() {
		return idbateria;
	}
	public void setIdbateria(int idbateria) {
		this.idbateria = idbateria;
	}
	public int getIdmotor() {
		return idmotor;
	}
	public void setIdmotor(int idmotor) {
		this.idmotor = idmotor;
	}
	public Vehiculo(String modelo, String tipoVehiculo, int idbateria, int idmotor) {
		super();
		this.modelo = modelo;
		this.tipoVehiculo = tipoVehiculo;
		this.idbateria = idbateria;
		this.idmotor = idmotor;
	}
	public Vehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
}
