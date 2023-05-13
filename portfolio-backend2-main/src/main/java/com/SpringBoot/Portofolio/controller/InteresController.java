package com.SpringBoot.Portofolio.controller;

import com.SpringBoot.Portofolio.model.Interes;
import com.SpringBoot.Portofolio.service.IInteresService;
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
public class InteresController {

    @Autowired
    private IInteresService interesUser;

    @GetMapping("/interes/traer")
    public List<Interes> getInteres() {
        return interesUser.getInteres();
    }

    @GetMapping("/interes/{id}")
    public Interes findInteres(@PathVariable Long id) {
        return interesUser.findInteres(id);
    }

    @PostMapping("/interes/crear")
    public String createInteres(@RequestBody Interes interes) {
        interesUser.saveInteres(interes);
        return "El Interes fue creada correctamente";
    }

    @DeleteMapping("/interes/borrar/{id}")
    public String deleteInteres(@PathVariable Long id) {
        interesUser.deleteInteres(id);
        return "El Interes fue eliminado correctamente";
    }

    @PutMapping("interes/editar/{id}")
    public Interes editInteres(@PathVariable Long id,
            @RequestBody Interes interes) {
        interes.setId(id);
        interesUser.saveInteres(interes);
        return interes;
    }
    
}
