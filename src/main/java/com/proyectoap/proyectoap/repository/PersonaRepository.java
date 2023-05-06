package com.proyectoap.proyectoap.repository;

import com.proyectoap.proyectoap.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long>{
    
}
