package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="disponibilidad")

public class Disponibilidad {
	
	@Id
	@Column(name="idDisponibilidad")
	private Long id;
	
	@Column(name="nombreDestino", length=50, nullable=false)
	private String nombreDestino;
	
	@Column(name="fechaSalida", length=50, nullable=false)
	private String fecha;
	
	@Column(name="horaSalida", nullable=false)
	private String hora;
	
	@Column(name = "numeroPuesto", nullable=false) 
    private int numeroPuesto;
	
	@ManyToOne()
	@JoinColumn(name="placaAuto", referencedColumnName = "placa")
	@JoinColumn(name="cantidadCupos", referencedColumnName = "cantidadPuestos")
	private Automovil autos;
	
	@Column(name="precio")
	private float precio;

	public Disponibilidad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Disponibilidad(Long id, String nombreDestino, String fecha, String hora, int numeroPuesto, Automovil autos,
			float precio) {
		super();
		this.id = id;
		this.nombreDestino = nombreDestino;
		this.fecha = fecha;
		this.hora = hora;
		this.numeroPuesto = numeroPuesto;
		this.autos = autos;
		this.precio = precio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreDestino() {
		return nombreDestino;
	}

	public void setNombreDestino(String nombreDestino) {
		this.nombreDestino = nombreDestino;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getNumeroPuesto() {
		return numeroPuesto;
	}

	public void setNumeroPuesto(int numeroPuesto) {
		this.numeroPuesto = numeroPuesto;
	}

	public Automovil getAutos() {
		return autos;
	}

	public void setAutos(Automovil autos) {
		this.autos = autos;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	

}