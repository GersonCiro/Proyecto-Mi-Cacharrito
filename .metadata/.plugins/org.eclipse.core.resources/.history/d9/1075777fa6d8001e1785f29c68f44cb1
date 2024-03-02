package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "consumidores")
public class Consumidor {
	
	@Id
	@Column(name="Identificacion")
	private Long Identificacion;
	
	@Column(name="nombreConsumidor")
	private String nombreConsumidor;
	
	@Column(name="apellidoConsumidor")
	private String apellidoConsumidor;
	
	@Column(name="telefonoConsumidor")
	private String telefonoConsumidor;
	
	@Column(name="fechaNaConsumidor")
	private String fechaNaConsumidor;

	public Consumidor() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Consumidor(Long identificacion, String nombreConsumidor, String apellidoConsumidor,
			String telefonoConsumidor, String fechaNaConsumidor) {
		super();
		Identificacion = identificacion;
		this.nombreConsumidor = nombreConsumidor;
		this.apellidoConsumidor = apellidoConsumidor;
		this.telefonoConsumidor = telefonoConsumidor;
		this.fechaNaConsumidor = fechaNaConsumidor;
	}



	public Long getIdentificacion() {
		return Identificacion;
	}

	public void setIdentificacion(Long identificacion) {
		Identificacion = identificacion;
	}

	public String getNombreConsumidor() {
		return nombreConsumidor;
	}

	public void setNombreConsumidor(String nombreConsumidor) {
		this.nombreConsumidor = nombreConsumidor;
	}

	public String getApellidoConsumidor() {
		return apellidoConsumidor;
	}

	public void setApellidoConsumidor(String apellidoConsumidor) {
		this.apellidoConsumidor = apellidoConsumidor;
	}

	public String getTelefonoConsumidor() {
		return telefonoConsumidor;
	}

	public void setTelefonoConsumidor(String telefonoConsumidor) {
		this.telefonoConsumidor = telefonoConsumidor;
	}

	public String getFechaNaConsumidor() {
		return fechaNaConsumidor;
	}

	public void setFechaNaConsumidor(String fechaNaConsumidor) {
		this.fechaNaConsumidor = fechaNaConsumidor;
	}

	
}
