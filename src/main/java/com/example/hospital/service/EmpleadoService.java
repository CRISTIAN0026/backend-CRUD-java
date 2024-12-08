package com.example.hospital.service;

import com.example.hospital.model.Empleado;
import com.example.hospital.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    // Método para obtener médicos
    public List<Empleado> obtenerMedicos() {
        return empleadoRepository.findByTipoEmpleado("medico");
    }
}
