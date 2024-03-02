package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="reservas")

public class Reserva {
	
	@Id
	@Column(name="idReserva")
	private Long idReserva;
	
	@ManyToOne()
	@JoinColumn(name="puestoReserva", referencedColumnName = "numeroPuesto")
	@JoinColumn(name="totalPago", referencedColumnName = "precio")
	private Disponibilidad disponibilidad;

	
	public Reserva() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Reserva(Long idReserva, Disponibilidad disponibilidad) {
		super();
		this.idReserva = idReserva;
		this.disponibilidad = disponibilidad;
	}


	public Long getIdReserva() {
		return idReserva;
	}


	public void setIdReserva(Long idReserva) {
		this.idReserva = idReserva;
	}


	public Disponibilidad getDisponibilidad() {
		return disponibilidad;
	}


	public void setDisponibilidad(Disponibilidad disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

}
