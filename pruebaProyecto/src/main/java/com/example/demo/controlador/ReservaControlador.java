package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Consumidor;
import com.example.demo.modelo.Disponibilidad;
import com.example.demo.modelo.Reserva;
import com.example.demo.repositorio.RepositorioConsumidor;
import com.example.demo.repositorio.RepositorioDisponibilidad;
import com.example.demo.repositorio.RepositorioReserva;

@RestController
@RequestMapping("/ver/reserva")
public class ReservaControlador {
	
	@Autowired
	private RepositorioDisponibilidad repositorioD;
	
	@Autowired
	private RepositorioReserva repositorioR;
	
	@Autowired
	private RepositorioConsumidor repositorioCo;
	
	@GetMapping("/cargarReserva")
	public List<Reserva> cargarReserva(){
		Disponibilidad dd1 = this.repositorioD.findById(7632L).get();
		Consumidor cc1 = (Consumidor) this.repositorioCo.findById(10653L).get();
		Reserva r1 = new Reserva (1843L, dd1, cc1);
		this.repositorioR.save(r1);
		
		Disponibilidad dd2 = this.repositorioD.findById(1234L).get();
		Consumidor cc2 = (Consumidor) this.repositorioCo.findById(10834L).get();
		Reserva r2 = new Reserva (2083L, dd2, cc2);
		this.repositorioR.save(r2);
		
		return this.repositorioR.findAll();
	}
	

}
