package com.api.model;

public class Motor {
	private int idmotor;
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
	public Motor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Motor(int idmotor, String nombreMotor) {
		super();
		this.idmotor = idmotor;
		this.nombreMotor = nombreMotor;
	}
	
}
