package com.example.demo.repositorio;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.modelo.Disponibilidad;

@Repository
public interface RepositorioDisponibilidad extends JpaRepository<Disponibilidad, Long> {
	
	public List<Disponibilidad> findByNombreDestino (String nombreDestino);
	public List<Disponibilidad> findByFecha (String fecha);
	public List<Disponibilidad> findByHora (String hora);
	public List<Disponibilidad> findByNumeroPuesto (int numeroPuesto);
	public List<Disponibilidad> findByPrecio (float precio);

}
