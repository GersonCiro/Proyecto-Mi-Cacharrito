package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="administrador")

public class Administrador {
	
	@Id
	@Column(name="user")
	private String user;
	
	@Column(name="pass", length=50, nullable=false)
	private String pass;

	public Administrador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrador(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
