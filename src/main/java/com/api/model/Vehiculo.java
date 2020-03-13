package com.api.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Vehiculo {
	private int idVehiculo;
	private String modelo;
	private String tipoVehiculo;
	private int idmotor;
	private int idbateria;
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
	public int getIdmotor() {
		return idmotor;
	}
	public void setIdmotor(int idmotor) {
		this.idmotor = idmotor;
	}
	public int getIdbateria() {
		return idbateria;
	}
	public void setIdbateria(int idbateria) {
		this.idbateria = idbateria;
	}
	public Vehiculo( String modelo, String tipoVehiculo, int idmotor, int idbateria) {
		super();
		this.modelo = modelo;
		this.tipoVehiculo = tipoVehiculo;
		this.idmotor = idmotor;
		this.idbateria = idbateria;
	}
	public Vehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
