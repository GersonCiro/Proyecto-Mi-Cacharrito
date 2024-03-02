package com.example.demo.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.modelo.Empleado;

@Repository
public interface repositorioEmpleado extends JpaRepository<Empleado, Long>{
	
	public List<Empleado> findByNombre (String nombre);
	public List<Empleado> findByApellido (String apellido);
	public Empleado findByEmail(String email);
	
	// 3. Cantidad de empleados
		@Query(value=("select count(*)\r\n"
				+ "from empleados;"), nativeQuery = true)
		public List<Object> totalEmpleados();
}
