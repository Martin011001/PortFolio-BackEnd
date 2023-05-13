package com.SpringBoot.Portofolio.controller;

import com.SpringBoot.Portofolio.model.Educacion;
import com.SpringBoot.Portofolio.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "https://portfolio-df72c.web.app")
public class EducacionController {

    @Autowired
    private IEducacionService interEducacion;

    @GetMapping("/educacion/traer")
    public List<Educacion> getEducacion() {
        return interEducacion.getEducacion();
    }

    @GetMapping("/educacion/{id}")
    public Educacion findEducacion(@PathVariable Long id) {
        return interEducacion.findEducacion(id);
    }

    @PostMapping("/educacion/crear")
    public String createEducacion(@RequestBody Educacion educacion) {
        interEducacion.saveEducacion(educacion);
        return "La Educacion fue creada correctamente";
    }

    @DeleteMapping("/educacion/borrar/{id}")
    public String deleteEducacion(@PathVariable Long id) {
        interEducacion.deleteEducacion(id);
        return "La Educacion fue eliminado correctamente";
    }

    @PutMapping("/educacion/editar/{id}")
    public Educacion editEducacion(@PathVariable Long id,
                                             @RequestBody Educacion educacion) {
        educacion.setId(id);
        interEducacion.saveEducacion(educacion);
        return educacion;
    }
    
}
