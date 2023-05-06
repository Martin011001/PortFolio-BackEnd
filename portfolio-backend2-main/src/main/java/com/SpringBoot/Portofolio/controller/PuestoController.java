package com.SpringBoot.Portofolio.controller;

import com.SpringBoot.Portofolio.model.Puesto;
import com.SpringBoot.Portofolio.service.IPuestoService;
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
public class PuestoController {
    
    @Autowired
    private IPuestoService interPuesto;

    @GetMapping("/puestos/traer")
    public List<Puesto> getPuestos() {
        return interPuesto.getPuestos();
    }

    @GetMapping("/puesto/{id}")
    public Puesto findPuesto(@PathVariable Long id) {
        return interPuesto.findPuesto(id);
    }

    @PostMapping("/puesto/crear")
    public String createPuesto(@RequestBody Puesto puesto) {
        interPuesto.savePuesto(puesto);
        return "El puesto fue creada correctamente";
    }

    @DeleteMapping("/puesto/borrar/{id}")
    public String deletePuesto(@PathVariable Long id) {
        interPuesto.deletePuesto(id);
        return "El puesto fue eliminada correctamente";
    }

    @PutMapping("/puesto/editar/{id}")
    public Puesto editPuesto(@PathVariable Long id,
                             @RequestBody Puesto puesto) {
        puesto.setId(id);
        interPuesto.savePuesto(puesto);
        return puesto;
    }
}
