package com.SpringBoot.Portofolio.service;

import com.SpringBoot.Portofolio.model.Puesto;
import java.util.List;

public interface IPuestoService {

    public List<Puesto> getPuestos();

    public void savePuesto(Puesto puesto);

    public void deletePuesto(Long id);

    public Puesto findPuesto(Long id);
}
