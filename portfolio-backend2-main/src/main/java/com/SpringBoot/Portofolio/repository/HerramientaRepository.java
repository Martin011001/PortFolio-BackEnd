package com.SpringBoot.Portofolio.repository;

import com.SpringBoot.Portofolio.model.Herramienta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HerramientaRepository extends JpaRepository<Herramienta, Long>{
    
}
