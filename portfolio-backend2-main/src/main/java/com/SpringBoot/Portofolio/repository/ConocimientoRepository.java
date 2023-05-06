package com.SpringBoot.Portofolio.repository;

import com.SpringBoot.Portofolio.model.Conocimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConocimientoRepository extends JpaRepository<Conocimiento, Long>{
    
}
