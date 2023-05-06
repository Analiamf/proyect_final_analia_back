package com.proyectoap.proyectoap.service;

import com.proyectoap.proyectoap.model.Usuario;
import com.proyectoap.proyectoap.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    public UsuarioRepository userRepo;
    
    @Override
    public Usuario findByNombre(String nombre) {
        return userRepo.findByNombre(nombre);
    }
   
}
