package com.api.model;

public class Bateria {
	private int idBateria;
	private String nombreBateria;
	public int getIdBateria() {
		return idBateria;
	}
	public void setIdBateria(int idBateria) {
		this.idBateria = idBateria;
	}
	public String getNombreBateria() {
		return nombreBateria;
	}
	public void setNombreBateria(String nombreBateria) {
		this.nombreBateria = nombreBateria;
	}
	public Bateria(int idBateria, String nombreBateria) {
		super();
		this.idBateria = idBateria;
		this.nombreBateria = nombreBateria;
	}
	public Bateria() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
