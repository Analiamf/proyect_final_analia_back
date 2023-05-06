package com.proyectoap.proyectoap.repository;

import com.proyectoap.proyectoap.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long>{

    public Usuario findByNombre(String nombre);
    
}
