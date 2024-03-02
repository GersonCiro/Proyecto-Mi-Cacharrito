package com.example.demo.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Automovil;

@Repository
public interface RepositorioAuto extends JpaRepository<Automovil, String>{
	
	public Automovil findByPlaca (String placa);
	public List<Automovil> findByModelo (String modelo);
	public List<Automovil> findByMarca (String marca);
	public List<Automovil> findByCantidadPuestos (int cantidadPuestos);
	
}
