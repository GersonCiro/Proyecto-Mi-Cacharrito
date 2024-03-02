package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="nominas")


public class Nomina {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="mesNomina", length=50, nullable=false)
	private String mes;
	
	@Column(name="salarioNomina", nullable=false)
	private int salario;
	
	@Column(name="yearNomina",length=50, nullable=false)
	private int year;
	
	
	@ManyToOne()	
	@JoinColumn(name = "id_Empleado", referencedColumnName = "identificacion")
	private Empleado empleados;
	
	
	public Nomina() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Nomina(String mes, int salario, int year, Empleado empleados) {
		super();
		this.mes = mes;
		this.salario = salario;
		this.year = year;
		this.empleados = empleados;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getMes() {
		return mes;
	}


	public void setMes(String mes) {
		this.mes = mes;
	}


	public int getSalario() {
		return salario;
	}


	public void setSalario(int salario) {
		this.salario = salario;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int año) {
		this.year = año;
	}


	public Empleado getEmpleados() {
		return empleados;
	}


	public void setEmpleados(Empleado empleados) {
		this.empleados = empleados;
	}

	
}