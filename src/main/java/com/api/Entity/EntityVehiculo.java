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
	  @JoinColumn(name = "id_motor")
	    private int idmotor;
	  @ManyToOne
	  @JoinColumn(name = "id_bateria")
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
	public EntityVehiculo(String modelo, String tipoVehiculo, int idmotor, int idbateria) {
		super();
		this.modelo = modelo;
		this.tipoVehiculo = tipoVehiculo;
		this.idmotor = idmotor;
		this.idbateria = idbateria;
	}
	public EntityVehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
