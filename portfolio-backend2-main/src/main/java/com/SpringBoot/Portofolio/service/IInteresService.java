package com.SpringBoot.Portofolio.service;

import com.SpringBoot.Portofolio.model.Interes;
import java.util.List;

public interface IInteresService {

    public List<Interes> getInteres();

    public void saveInteres(Interes interes);

    public void deleteInteres(Long id);

    public Interes findInteres(Long id);
}
