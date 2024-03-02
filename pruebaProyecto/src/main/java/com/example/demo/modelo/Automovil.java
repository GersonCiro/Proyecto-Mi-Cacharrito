package com.example.demo.modelo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="autos")
public class Automovil {
	
	
	@Id
	@Column(name="placa")
	private String placa;
	
	@Column(name="modelo", length=50, nullable=false)
	private String modelo;
	
	@Column(name="marca",length=50, nullable=false)
	private String marca;
	
	@Column(name="cantidadPuestos", nullable=false)
	private int cantidadPuestos;

	public Automovil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Automovil(String placa, String modelo, String marca, int cantidadPuestos) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		this.cantidadPuestos = cantidadPuestos;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCantidadPuestos() {
		return cantidadPuestos;
	}

	public void setCantidadPuestos(int cantidadPuestos) {
		this.cantidadPuestos = cantidadPuestos;
	}


}
