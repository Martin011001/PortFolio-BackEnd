
package com.SpringBoot.Portofolio.controller;

import com.SpringBoot.Portofolio.model.Persona;
import com.SpringBoot.Portofolio.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://portfolio-df72c.web.app")
public class PersonaController {
    @Autowired
    private IPersonaService interPersona;
    
    @GetMapping("/personas/traer")
    public List<Persona> getPersonas(){
        return interPersona.getPersonas();
    }
    
    @GetMapping("/personas/{id}")
    public Persona findPersona(@PathVariable Long id){
        return interPersona.findPersona(id);
    }
    
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona perso){
        interPersona.savePersona(perso);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona (@PathVariable Long id){
        interPersona.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                               @RequestBody Persona perso){
          perso.setId(id);
          interPersona.savePersona(perso);
          return perso;
    }
}

/*@RequestParam("nombre") String nuevoNombre,
                               @RequestParam("apellido") String nuevoApellido,
                               @RequestParam("img") String nuevoImg,
                               @RequestParam("titulo") String nuevoTitulo,
                               @RequestParam("info") String nuevoInfo)

        Persona perso = interPersona.findPersona(id);
        
        perso.setApellido(nuevoApellido);
        perso.setNombre(nuevoNombre);
        perso.setImg(nuevoImg);
        perso.setTitulo(nuevoTitulo);
        perso.setInfo(nuevoInfo);
        
        interPersona.savePersona(perso);
        return perso;
*/