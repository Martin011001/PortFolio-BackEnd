package com.SpringBoot.Portofolio.controller;

import com.SpringBoot.Portofolio.model.SobreMi;
import com.SpringBoot.Portofolio.service.ISobreMiService;
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
public class SobreMiController {
    
    @Autowired
    private ISobreMiService interSobreMi;
    
    @GetMapping("/sobreMi/traer")
    public List<SobreMi> getSobreMi(){
        return interSobreMi.getSobreMi();
    }
    
    @GetMapping("/sobreMi/{id}")
    public SobreMi findSobreMi(@PathVariable Long id){
        return interSobreMi.findSobreMi(id);
    }
    
    @PostMapping("/sobreMi/crear")
    public String createSobreMi(@RequestBody SobreMi sobreMi){
        interSobreMi.saveSobreMi(sobreMi);
        return "El SobreMi fue creada correctamente";
    }
    
    @DeleteMapping("/sobreMi/borrar/{id}")
    public String deleteSobreMi (@PathVariable Long id){
        interSobreMi.deleteSobreMi(id);
        return "El SobreMi fue eliminado correctamente";
    }
    
    @PutMapping("/sobreMi/editar/{id}")
    public SobreMi editSobreMi(@PathVariable Long id,
                               @RequestBody SobreMi sobreMi){
          sobreMi.setId(id);
          interSobreMi.saveSobreMi(sobreMi);
          return sobreMi;
    }
}
