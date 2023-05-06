package com.SpringBoot.Portofolio.repository;

import com.SpringBoot.Portofolio.model.Puesto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PuestoRepository extends JpaRepository<Puesto, Long>{
    
}
