package com.example.hospital.service;


import com.example.hospital.model.Paciente;
import com.example.hospital.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public Paciente crearPaciente(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    public List<Paciente> obtenerTodosPacientes() {
        List<Paciente> pacientes = pacienteRepository.findAll();
        System.out.println("Pacientes encontrados: " + pacientes.size());
        return pacientes;
    }
    public Optional<Paciente> obtenerPaciente(Long id) {
        return pacienteRepository.findById(id);
    }

    public Paciente actualizarPaciente(Long id, Paciente pacienteDetails) {
        Paciente paciente = pacienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Paciente no encontrado"));

        // Actualizar solo los campos no nulos de pacienteDetails
        if (pacienteDetails.getNombre() != null) {
            paciente.setNombre(pacienteDetails.getNombre());
        }
        if (pacienteDetails.getDireccion() != null) {
            paciente.setDireccion(pacienteDetails.getDireccion());
        }
        if (pacienteDetails.getTelefono() != null) {
            paciente.setTelefono(pacienteDetails.getTelefono());
        }
        if (pacienteDetails.getCodigoPostal() != null) {
            paciente.setCodigoPostal(pacienteDetails.getCodigoPostal());
        }
        if (pacienteDetails.getNif() != null) {
            paciente.setNif(pacienteDetails.getNif());
        }
        if (pacienteDetails.getNumSeguridadSocial() != null) {
            paciente.setNumSeguridadSocial(pacienteDetails.getNumSeguridadSocial());
        }
        if (pacienteDetails.getMedicoId() != null) {
            paciente.setMedicoId(pacienteDetails.getMedicoId());
        }

        return pacienteRepository.save(paciente);
    }


    public void eliminarPaciente(Long id) {
        Paciente paciente = pacienteRepository.findById(id).orElseThrow(() -> new RuntimeException("Paciente no encontrado"));
        pacienteRepository.delete(paciente);
    }
}

