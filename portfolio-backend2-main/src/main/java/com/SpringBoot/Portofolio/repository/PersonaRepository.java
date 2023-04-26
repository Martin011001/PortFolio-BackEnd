
package com.SpringBoot.Portofolio.repository;

import com.SpringBoot.Portofolio.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{
    
}
