package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Administrador;
import com.example.demo.repositorio.RepositorioAdministrador;


@RestController
@RequestMapping("/ver/Admin")
public class AdministradorControlador {
	
	@Autowired
	private RepositorioAdministrador repositorioAdmin;
	
	public List <Administrador> crearAdmin(){
		Administrador admin = new Administrador ("4dmin", "P4ssw0rd");
		this.repositorioAdmin.save(admin);
		return this.repositorioAdmin.findAll();
	}

}
