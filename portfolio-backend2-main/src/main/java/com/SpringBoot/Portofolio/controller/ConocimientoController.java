package com.SpringBoot.Portofolio.controller;

import com.SpringBoot.Portofolio.model.Conocimiento;
import com.SpringBoot.Portofolio.service.IConocimientoService;
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
public class ConocimientoController {
    
    @Autowired
    private IConocimientoService interConocimiento;

        @GetMapping("/conocimientoSaber/traer")
    public List<Conocimiento> getConocimiento() {
        return interConocimiento.getConocimiento();
    }

    @GetMapping("/conocimiento/{id}")
    public Conocimiento findConocimiento(@PathVariable Long id) {
        return interConocimiento.findConocimiento(id);
    }

    @PostMapping("/conocimiento/crear")
    public String createConocimiento(@RequestBody Conocimiento conocimiento) {
        interConocimiento.saveConocimiento(conocimiento);
        return "El conocimiento fue creada correctamente";
    }

    @DeleteMapping("/conocimiento/borrar/{id}")
    public String deleteConocimiento(@PathVariable Long id) {
        interConocimiento.deleteConocimiento(id);
        return "El conocimiento fue eliminada correctamente";
    }

    @PutMapping("/conocimiento/editar/{id}")
    public Conocimiento editConocimiento(@PathVariable Long id,
                                         @RequestBody Conocimiento conocimiento) {
        conocimiento.setId(id);
        interConocimiento.saveConocimiento(conocimiento);
        return conocimiento;
    }
}
