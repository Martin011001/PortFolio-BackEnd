package com.SpringBoot.Portofolio.controller;

import com.SpringBoot.Portofolio.model.Herramienta;
import com.SpringBoot.Portofolio.service.IHerramientaService;
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
public class HerramientaController {
    
    @Autowired
    private IHerramientaService interHerramienta;

    @GetMapping("/herramienta/traer")
    public List<Herramienta> getHerramienta() {
        return interHerramienta.getHerramienta();
    }

    @GetMapping("/herramienta/{id}")
    public Herramienta findHerramienta(@PathVariable Long id) {
        return interHerramienta.findHerramienta(id);
    }

    @PostMapping("/herramienta/crear")
    public String createHerramienta(@RequestBody Herramienta herramienta) {
        interHerramienta.saveHerramienta(herramienta);
        return "La Herramienta fue creada correctamente";
    }

    @DeleteMapping("/herramienta/borrar/{id}")
    public String deleteHerramienta(@PathVariable Long id) {
        interHerramienta.deleteHerramienta(id);
        return "La Herramienta fue eliminada correctamente";
    }

    @PutMapping("/herramienta/editar/{id}")
    public Herramienta editHerramienta(@PathVariable Long id,
                                       @RequestBody Herramienta herramienta) {
        herramienta.setId(id);
        interHerramienta.saveHerramienta(herramienta);
        return herramienta;
    }
}
