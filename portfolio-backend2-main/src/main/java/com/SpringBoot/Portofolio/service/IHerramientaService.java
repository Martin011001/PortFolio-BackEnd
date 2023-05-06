package com.SpringBoot.Portofolio.service;

import com.SpringBoot.Portofolio.model.Herramienta;
import java.util.List;

public interface IHerramientaService {
    
    public List<Herramienta> getHerramienta();

    public void saveHerramienta(Herramienta herramienta);

    public void deleteHerramienta(Long id);

    public Herramienta findHerramienta(Long id);
}
