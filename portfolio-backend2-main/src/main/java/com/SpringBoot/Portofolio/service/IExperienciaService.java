package com.SpringBoot.Portofolio.service;

import com.SpringBoot.Portofolio.model.Experiencia;
import java.util.List;

public interface IExperienciaService {

    public List<Experiencia> getExperiencia();

    public void saveExperiencia(Experiencia expe);

    public void deleteExperiencia(Long id);

    public Experiencia findExperiencia(Long id);
}
