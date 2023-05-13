package com.SpringBoot.Portofolio.repository;

import com.SpringBoot.Portofolio.model.Interes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InteresRepository extends JpaRepository<Interes, Long>{
    
}
