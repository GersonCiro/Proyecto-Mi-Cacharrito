package com.example.demo.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.modelo.Empleado;
import com.example.demo.modelo.Nomina;
import com.example.demo.repositorio.repositorioEmpleado;
import com.example.demo.repositorio.repositorioNomina;

@RestController
@RequestMapping("/ver/e1/")
@CrossOrigin(origins = "http://localhost:4200/")
public class EmpleadoControlador {
	
	@Autowired
	private repositorioEmpleado repositorio;
	
	@Autowired
	private repositorioNomina repositorioN;
	
	@GetMapping("/empleados")
	public List<Empleado> verTodosEmpleados(){
		return repositorio.findAll();
	}

    @PostMapping("/guardar")
    public Empleado guardarEmpleado(@RequestBody Empleado e){
	    return this.repositorio.save(e);  }	
    
    
    @PutMapping("/actualizarDato")
    public Empleado actualizarDato(@RequestBody Empleado e) {
    	return this.repositorio.save(e);
    }
    
    
    @PostMapping("/verEmpleado")
    public Empleado verEmpleado(@RequestBody Long id) {
    	return this.repositorio.findById(id).get();
    }
    
    @PutMapping("/eliminar")

    public Optional<Empleado> eliminarEmpleado(@RequestBody Long id){
    	Empleado e = this.repositorio.findById(id).get();
    	List <Nomina> n = this.repositorioN.findByEmpleados(e);
    	for(int i = 0; i < n.size(); i++) {
    		this.repositorioN.deleteById(n.get(i).getId());
    	}
    	this.repositorio.deleteById(id);
    	return null;
    }
    
	@GetMapping("/buscarPorNombre")
	public List<Empleado> buscarPorNombre() {
		return this.repositorio.findByNombre("Daniel");
	}
	
	@GetMapping("/buscarPorApellido")
	public List<Empleado> buscarPorApellido() {
		return this.repositorio.findByApellido("Bastos");
	}
    
	@GetMapping("/buscarPorEmail")
	public Empleado buscarPorEmail() {
		return this.repositorio.findByEmail("car12@gmail.com");
	}
	
	@GetMapping("/cantidadEmpleado")
	public List<Object> mostrarCantidadEmpleados(){
		return this.repositorio.totalEmpleados();
	}
}
