package com.SpringBoot.Portofolio.service;

import com.SpringBoot.Portofolio.model.Herramienta;
import com.SpringBoot.Portofolio.repository.HerramientaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HerramientaService implements IHerramientaService {

    @Autowired
    private HerramientaRepository herramientaRepository;

    @Override
    public List<Herramienta> getHerramienta() {
        List<Herramienta> listaHerramientas = herramientaRepository.findAll();
        return listaHerramientas;
    }

    @Override
    public void saveHerramienta(Herramienta herramienta) {
        herramientaRepository.save(herramienta);
    }

    @Override
    public void deleteHerramienta(Long id) {
        herramientaRepository.deleteById(id);

    }

    @Override
    public Herramienta findHerramienta(Long id) {
        Herramienta herramienta = herramientaRepository.findById(id).orElse(null);
        return herramienta;
    }

}
