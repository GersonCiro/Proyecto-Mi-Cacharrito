package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.modelo.Automovil;
import com.example.demo.modelo.Disponibilidad;
import com.example.demo.repositorio.RepositorioAuto;
import com.example.demo.repositorio.RepositorioDisponibilidad;

@RestController
@RequestMapping("/ver/disponibilidad")
public class DisponibilidadControlador {
	
	@Autowired
	private RepositorioDisponibilidad repositorioD;
	
	@Autowired
	private RepositorioAuto repositorioA;
	
	@GetMapping("/cargardisponibilidad")
	public List<Disponibilidad> cargarDisponibilidad(){
		Automovil ap2 = this.repositorioA.findByPlaca("acg-709");
		Disponibilidad d2 = new Disponibilidad (7632L, "Medellin", "27/Marzo/2024", "09:00am", 7, ap2, 90000);
		this.repositorioD.save(d2);
		Automovil ap1 = this.repositorioA.findByPlaca("ade-567");
		Disponibilidad d1 = new Disponibilidad (1234L, "Medellin", "28/Marzo/2024", "10:00am", 5, ap1, 90000);
		this.repositorioD.save(d1);
		
		return this.repositorioD.findAll();
		
	}
	
}
