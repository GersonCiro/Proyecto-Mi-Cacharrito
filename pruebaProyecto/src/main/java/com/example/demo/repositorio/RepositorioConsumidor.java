package com.example.demo.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.modelo.Consumidor;

@Repository
public interface RepositorioConsumidor extends JpaRepository<Consumidor, Long>{
	
	public List<Consumidor> findByNombreConsumidor(String nombreConsumidor);
	public List<Consumidor> findByApellidoConsumidor(String apellidoConsumidor);
	public List<Consumidor> findByTelefonoConsumidor(String telefonoConsumidor);
	public List<Consumidor> findByFechaNaConsumidor(String fechaNaConsumidor);

}
