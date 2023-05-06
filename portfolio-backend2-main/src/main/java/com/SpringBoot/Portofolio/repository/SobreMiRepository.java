package com.SpringBoot.Portofolio.repository;

import com.SpringBoot.Portofolio.model.SobreMi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SobreMiRepository extends JpaRepository<SobreMi, Long>{
    
}
