package com.SpringBoot.Portofolio.service;

import com.SpringBoot.Portofolio.model.Conocimiento;
import java.util.List;

public interface IConocimientoService {

    
    public List<Conocimiento> getConocimiento();

    public void saveConocimiento(Conocimiento expe);

    public void deleteConocimiento(Long id);

    public Conocimiento findConocimiento(Long id);
    
    
}
