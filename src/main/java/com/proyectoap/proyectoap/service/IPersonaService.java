package com.proyectoap.proyectoap.service;

import com.proyectoap.proyectoap.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> verPersona ();
    public void crearPersona (Persona per);
    public void borrarPersona (Long id);
    public Persona buscarPersona (long id);
    
}
