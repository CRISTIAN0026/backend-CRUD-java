package com.example.hospital.controller;

import com.example.hospital.model.Empleado;
import com.example.hospital.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/empleados")
@CrossOrigin(origins = "http://localhost:3000")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/medicos")
    public List<Empleado> obtenerMedicos() {
        return empleadoService.obtenerMedicos();  // Filtra a los médicos
    }
}

