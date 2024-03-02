package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.modelo.Automovil;
import com.example.demo.repositorio.RepositorioAuto;

@RestController
@RequestMapping("/ver/autos")
public class AutoControlador {
	
	@Autowired
	private RepositorioAuto repositorioA;
	
	@GetMapping("/agregarAuto")
	public List<Automovil> agregarAuto(){
		Automovil a1 = new Automovil ("ade-567", "Corriente", "chevrolet", 20);
		this.repositorioA.save(a1);
		Automovil a2 = new Automovil ("acg-709", "Corriente", "chevrolet", 20);
		this.repositorioA.save(a2);
		return this.repositorioA.findAll();
	}
}
