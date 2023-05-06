package com.SpringBoot.Portofolio.service;

import com.SpringBoot.Portofolio.model.SobreMi;
import java.util.List;

public interface ISobreMiService {

    public List<SobreMi> getSobreMi();

    public void saveSobreMi(SobreMi perso);

    public void deleteSobreMi(Long id);

    public SobreMi findSobreMi(Long id);
}
