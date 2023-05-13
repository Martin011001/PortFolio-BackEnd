package com.SpringBoot.Portofolio.controller;

import com.SpringBoot.Portofolio.model.Experiencia;
import com.SpringBoot.Portofolio.service.IExperienciaService;
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
public class ExperienciaController {

    @Autowired
    private IExperienciaService interExperiencia;

    @GetMapping("/experiencias/traer")
    public List<Experiencia> getExperiencia() {
        return interExperiencia.getExperiencia();
    }

    @GetMapping("/experiencias/{id}")
    public Experiencia findExperiencia(@PathVariable Long id) {
        return interExperiencia.findExperiencia(id);
    }

    @PostMapping("/experiencias/crear")
    public Experiencia createExperiencia(@RequestBody Experiencia expe) {
        interExperiencia.saveExperiencia(expe);
        return expe;
    }

    @DeleteMapping("/experiencias/borrar/{id}")
    public String deleteExperiencia(@PathVariable Long id) {
        interExperiencia.deleteExperiencia(id);
        return "La experiencia fue eliminada correctamente";
    }

    @PutMapping("/experiencias/editar/{id}")
    public Experiencia editExperiencia(@PathVariable Long id,
                                       @RequestBody Experiencia expe) {
        expe.setId(id);
        interExperiencia.saveExperiencia(expe);
        return expe;
    }
}
