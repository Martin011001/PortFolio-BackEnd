package com.SpringBoot.Portofolio.service;

import com.SpringBoot.Portofolio.model.Experiencia;
import com.SpringBoot.Portofolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    private ExperienciaRepository expeRepository;

    @Override
    public List<Experiencia> getExperiencia() {
      List<Experiencia> listaExperiencias = expeRepository.findAll();
        return listaExperiencias;  
    }

    @Override
    public void saveExperiencia(Experiencia expe) {
        expeRepository.save(expe);
    }

    @Override
    public void deleteExperiencia(Long id) {
        expeRepository.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(Long id) {
        Experiencia expe = expeRepository.findById(id).orElse(null);
        return expe;
    }
}
