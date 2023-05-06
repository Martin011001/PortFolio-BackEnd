package com.SpringBoot.Portofolio.service;

import com.SpringBoot.Portofolio.model.Conocimiento;
import com.SpringBoot.Portofolio.repository.ConocimientoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConocimientoService implements IConocimientoService{

    @Autowired
    private ConocimientoRepository conocimientoRepository;
    
    @Override
    public List<Conocimiento> getConocimiento() {
        List<Conocimiento> listaConocimientos = conocimientoRepository.findAll();
        return listaConocimientos;  
    }

    @Override
    public void saveConocimiento(Conocimiento conocimiento) {
        conocimientoRepository.save(conocimiento);
    }

    @Override
    public void deleteConocimiento(Long id) {
        conocimientoRepository.deleteById(id);
    }

    @Override
    public Conocimiento findConocimiento(Long id) {
         Conocimiento conocimiento = conocimientoRepository.findById(id).orElse(null);
        return conocimiento;
    }
    
    
}
