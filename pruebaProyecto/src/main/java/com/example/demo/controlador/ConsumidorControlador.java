package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.modelo.Consumidor;
import com.example.demo.repositorio.RepositorioConsumidor;

@RestController
@RequestMapping("/ver/consumidores")
public class ConsumidorControlador {
	
	@Autowired
	private RepositorioConsumidor repositorioCo;
	
	@GetMapping("/cargarconsumidor")
	public List<Consumidor> cargarConsumidor(){
		Consumidor co1 = new Consumidor (10834L, "Gerson", "Ciro", "3156789098","24 / Diciembrer / 1998");
		this.repositorioCo.save(co1);
		Consumidor co2 = new Consumidor (10653L, "Helinor", "puentes", "3124567893","18 / Marzo / 2004");
		this.repositorioCo.save(co2);
		return this.repositorioCo.findAll();
	}

}
