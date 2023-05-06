package com.SpringBoot.Portofolio.service;

import com.SpringBoot.Portofolio.model.Puesto;
import com.SpringBoot.Portofolio.repository.PuestoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PuestoService implements IPuestoService{
    
    @Autowired
    private PuestoRepository puestoRepository;

    @Override
    public List<Puesto> getPuestos() {
        List<Puesto> listaPuestos = puestoRepository.findAll();
        return listaPuestos;
    }

    @Override
    public void savePuesto(Puesto puesto) {
        puestoRepository.save(puesto);
    }

    @Override
    public void deletePuesto(Long id) {
        puestoRepository.deleteById(id);

    }

    @Override
    public Puesto findPuesto(Long id) {
        Puesto puesto = puestoRepository.findById(id).orElse(null);
        return puesto;
    }
}
