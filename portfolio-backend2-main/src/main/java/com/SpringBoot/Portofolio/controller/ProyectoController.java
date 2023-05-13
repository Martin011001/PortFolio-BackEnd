package com.SpringBoot.Portofolio.controller;

import com.SpringBoot.Portofolio.model.Proyecto;
import com.SpringBoot.Portofolio.service.IProyectoService;
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
public class ProyectoController {

    @Autowired
    private IProyectoService proyectoUser;

    @GetMapping("/proyecto/traer")
    public List<Proyecto> getProyecto() {
        return proyectoUser.getProyecto();
    }

    @GetMapping("/proyecto/{id}")
    public Proyecto findProyecto(@PathVariable Long id) {
        return proyectoUser.findProyecto(id);
    }

    @PostMapping("/proyecto/crear")
    public String createProyecto(@RequestBody Proyecto proyecto) {
        proyectoUser.saveProyecto(proyecto);
        return "El Proyecto fue creada correctamente";
    }

    @DeleteMapping("/proyecto/borrar/{id}")
    public String deleteProyecto(@PathVariable Long id) {
        proyectoUser.deleteProyecto(id);
        return "El Proyecto fue eliminado correctamente";
    }

    @PutMapping("proyecto/editar/{id}")
    public Proyecto editProyecto(@PathVariable Long id,
            @RequestBody Proyecto proyecto) {
        proyecto.setId(id);
        proyectoUser.saveProyecto(proyecto);
        return proyecto;
    }
    
}
