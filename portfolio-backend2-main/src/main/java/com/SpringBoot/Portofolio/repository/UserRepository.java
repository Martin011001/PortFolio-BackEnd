
package com.SpringBoot.Portofolio.repository;

import com.SpringBoot.Portofolio.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
    
}
