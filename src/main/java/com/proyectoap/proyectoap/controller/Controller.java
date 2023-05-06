package com.proyectoap.proyectoap.Controller;

import com.proyectoap.proyectoap.model.Persona;
import com.proyectoap.proyectoap.model.Usuario;
import com.proyectoap.proyectoap.service.IPersonaService;
import com.proyectoap.proyectoap.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class Controller {
    // Inyeccion de dependencias 
    @Autowired
    private IPersonaService persoServ;
    @Autowired
    private IUsuarioService userServ;
    
    
    /*List<Persona> listaPersonas = new ArrayList();
    
    // Ejemplo de PathVariable
    @GetMapping ("/hola/{nombre}/{apellido}/{edad}") 
    public String decirHola(@PathVariable String nombre, 
            @PathVariable String apellido, 
            @PathVariable String edad) {
        return "Hola mundo " + nombre + " apellido: " + apellido + " edad: " + edad; // para llamarlo en postman localhost:8080/hola/Anaia/Fritzler/37
    }
    
    // Ejemplo de RequestParam
    @GetMapping ("/chau")
    public String decirChau (@RequestParam String nombre,
            @RequestParam String apellido,
            @RequestParam String edad) {
        return "Chau mundo " + nombre + " apellido: " + apellido + " edad: " + edad; // para llamarlo desde Postman localhost:8080/chau?nombre=Analia&apellido=Fritzler&edad=37
    }*/
    
    @GetMapping ("/buscar/{nombre}") 
    @ResponseBody 
    public Usuario decirHola(@PathVariable String nombre) {
        return userServ.findByNombre(nombre);
    }
    
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
    }
    
    @GetMapping ("/ver/personas")
    @ResponseBody // para que me lo devuelva la respuesta en el body
    public List<Persona> verPersonas () {
        return persoServ.verPersona();
    }
    
    @GetMapping ("/persona/{id}")
    @ResponseBody // para que me lo devuelva la respuesta en el body
    public Persona getPersona (@PathVariable Long id) {
        return persoServ.buscarPersona(id);
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona (@PathVariable Long id) {
        persoServ.borrarPersona(id);      
    }
    
    @PutMapping ("/edit/persona")
    public void modificarPersona (@RequestBody Persona per) {
        persoServ.crearPersona(per);        
    }  
    
    @PostMapping ("/login")
    public Boolean iniciarUsuario(@RequestBody Usuario usuario){
        Usuario user = userServ.findByNombre(usuario.getNombre());
        
        if (user!=null){
            Boolean a = user.getPassword() == null ? usuario.getPassword() == null : user.getPassword().equals(usuario.getPassword());
            return a;
        }
        else{
            return false;
        }
    }
    
}
