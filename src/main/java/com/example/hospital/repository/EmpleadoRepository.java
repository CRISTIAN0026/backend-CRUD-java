package com.example.hospital.repository;

import com.example.hospital.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

    // Método para obtener todos los empleados de tipo "medico"
    List<Empleado> findByTipoEmpleado(String tipoEmpleado);
}

