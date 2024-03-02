package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.modelo.Empleado;
import com.example.demo.modelo.Nomina;
import com.example.demo.repositorio.repositorioEmpleado;
import com.example.demo.repositorio.repositorioNomina;

@RestController
@RequestMapping("/verNomina/nomina/")
@CrossOrigin(origins = "http://localhost:4200/")
public class nominaControlador {
	
	@Autowired
	private repositorioNomina repositorioN;
	
	@Autowired
	private repositorioEmpleado repositorio;
	
	@GetMapping("/nominas")
	public List<Nomina> verTodosNomina(){
		return repositorioN.findAll();
	}
	
	@GetMapping("/eliminarTodo")
	public String eliminarNominas() {
	this.repositorioN.deleteAll();
	return "Nominas Eliminada";
	}
	
	@GetMapping("/guardarN")
	public List<Nomina>guardarNomina(){
		Empleado e = this.repositorio.findById(1260L).get();
		Nomina n = new Nomina ("Enero", 1500000, 2024, e);
		this.repositorioN.save(n);
		Empleado eF1 = this.repositorio.findById(1260L).get();
		Nomina nF1 = new Nomina ("Febrero", 1500000, 2024, eF1);
		this.repositorioN.save(nF1);
		Empleado eF = this.repositorio.findById(1010L).get();
		Nomina nF = new Nomina ("Febrero", 1500000, 2024, eF);
		this.repositorioN.save(nF);
		Empleado e1 = this.repositorio.findById(1010L).get();
		Nomina n1 = new Nomina ("Enero", 1500000, 2024, e1);
		this.repositorioN.save(n1);
		Empleado e2 = this.repositorio.findById(1065L).get();
		Nomina n2 = new Nomina ("Enero", 1500000, 2024, e2);
		this.repositorioN.save(n2);
		return this.repositorioN.findAll();
	}
	
	@GetMapping("/buscarN")
	public Nomina buscarNomina() {
		long n = 2;
		return this.repositorioN.findById(n).get();
	}
	
	@GetMapping("/eliminarN")
	public String eliminarNomina() {
	this.repositorioN.deleteById(3L);
	return "Nomina Eliminada";
	}
	
	@GetMapping("/actualizarDatoN")
	public Nomina actualizarNomina() {
		Nomina n = this.repositorioN.findById(11L).get();
		n.setYear(2025);
		this.repositorioN.save(n);
		return this.repositorioN.findById(11L).get();
	}
	
	@GetMapping("/buscarPorMes")
	public List<Nomina> buscarPorMes() {
		return this.repositorioN.findByMes("Enero");
	}
	
	@GetMapping("/buscarPorSalario")
	public List<Nomina> buscarPorSalario() {
		return this.repositorioN.findBySalario(1800000);
	}
	
	@GetMapping("/buscarPorAño")
	public List<Nomina> buscarPorAño() {
		return this.repositorioN.findByYear(2025);
	}
	
	@GetMapping("/sumaSalarioPorPersona")
	public List<Object> mostrarSumaSalarioEmpleados(){
		return this.repositorioN.totalNominaEmpleado();
	}
	
	@GetMapping("/sumaSalarioPorMes")
	public List<Object> mostrarSumaSalarioEmpleadosMes(){
		return this.repositorioN.totalNominaEmpleadoMes();
	}
	
	@GetMapping("/cantidadPagosEmpleado")
	public List<Object> mostrarCantidadPagosEmpleados(){
		return this.repositorioN.totaPagos();}
}
