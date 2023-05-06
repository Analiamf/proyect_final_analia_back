package com.proyectoap.proyectoap.service;

import com.proyectoap.proyectoap.model.Usuario;

public interface IUsuarioService {
    
    public Usuario findByNombre (String nombre);
}
