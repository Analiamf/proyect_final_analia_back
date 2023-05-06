package com.proyectoap.proyectoap.service;

import com.proyectoap.proyectoap.model.Persona;
import com.proyectoap.proyectoap.repository.PersonaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    public PersonaRepository persoRepo;
    
    @Override
    public List<Persona> verPersona() {
        // Tenemos que hacer una inyeccion de dependencias del repositorio con el que vamos a trabajar con @Autowired
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(long id) {
        return persoRepo.findById(id).orElse(null);
    }
    
}
