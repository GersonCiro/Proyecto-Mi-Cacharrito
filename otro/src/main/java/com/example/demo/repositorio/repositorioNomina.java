package com.example.demo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Empleado;
import com.example.demo.modelo.Nomina;

@Repository
public interface repositorioNomina extends JpaRepository<Nomina, Long>{
	
	
	public List<Nomina> findByMes (String mes);
	public List<Nomina> findByYear ( int year);
	public List<Nomina> findBySalario (int salario);
	public List<Nomina> findByEmpleados(Empleado empleados);
	
// 1.Total de nómina en el año por cada empleado.
	@Query(value=("Select n.id_empleado, e.nombre, sum(n.salario_nomina) \r\n"
			+ "from nominas n \r\n"
			+ "inner join empleados e on n.id_empleado = e.identificacion\r\n"
			+ "group by n.id_empleado;"), nativeQuery = true)
	public List<Object> totalNominaEmpleado();
	
// 2. Total nómina por mes
	@Query(value=("Select n.mes_nomina, sum(n.salario_nomina)\r\n"
			+ "from nominas n\r\n"
			+ "group by n.mes_nomina;"), nativeQuery = true)
	public List<Object> totalNominaEmpleadoMes();
	
// 4. Cuántos pagos ha recibido cada empleado
		@Query(value=("Select e.identificacion, e.nombre, e.apellido, count(e.identificacion) from empleados e\r\n"
				+ "inner join nominas n on e.identificacion = n.id_empleado\r\n"
				+ "group by e.identificacion;"), nativeQuery = true)
		public List<Object> totaPagos();

	
}
