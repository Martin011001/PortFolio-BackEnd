package com.SpringBoot.Portofolio.service;

import com.SpringBoot.Portofolio.model.SobreMi;
import com.SpringBoot.Portofolio.repository.SobreMiRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SobreMiService implements ISobreMiService {

    @Autowired
    private SobreMiRepository sobreMiRepository;

    @Override
    public List<SobreMi> getSobreMi() {
        List<SobreMi> listaSobreMi = sobreMiRepository.findAll();
        return listaSobreMi;
    }

    @Override
    public void saveSobreMi(SobreMi sobreMi) {
        sobreMiRepository.save(sobreMi);
    }

    @Override
    public void deleteSobreMi(Long id) {
        sobreMiRepository.deleteById(id);
    }

    @Override
    public SobreMi findSobreMi(Long id) {
        SobreMi sobreMi = sobreMiRepository.findById(id).orElse(null);
        return sobreMi;
    }

}
