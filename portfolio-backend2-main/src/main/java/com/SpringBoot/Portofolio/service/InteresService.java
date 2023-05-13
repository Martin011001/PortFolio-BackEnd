package com.SpringBoot.Portofolio.service;

import com.SpringBoot.Portofolio.model.Interes;
import com.SpringBoot.Portofolio.repository.InteresRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InteresService implements IInteresService{
   

    @Autowired
    private InteresRepository interesRepository;

    @Override
    public List<Interes> getInteres() {
        List<Interes> listaInteres = interesRepository.findAll();
        return listaInteres;
    }

    @Override
    public void saveInteres(Interes interes) {
        interesRepository.save(interes);
    }

    @Override
    public void deleteInteres(Long id) {
        interesRepository.deleteById(id);
    }

    @Override
    public Interes findInteres(Long id) {
        Interes interes = interesRepository.findById(id).orElse(null);
        return interes;
    }
}
