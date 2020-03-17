package com.api.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="bateria")
public class EntityBateria {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_Bateria;
	@Column(name="nombre_bateria",nullable=false,length=50)	
	private String nombreBateria;
	public int getIdBateria() {
		return id_Bateria;
	}
	public void setIdBateria(int id_Bateria) {
		this.id_Bateria = id_Bateria;
	}
	public String getNombreBateria() {
		return nombreBateria;
	}
	public void setNombreBateria(String nombreBateria) {
		this.nombreBateria = nombreBateria;
	}
	public EntityBateria(String nombreBateria) {
		super();

		this.nombreBateria = nombreBateria;
	}
	public EntityBateria() {
		super();
		// TODO Auto-generated constructor stub
	}
}
