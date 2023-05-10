package com.SpringBoot.Portofolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Entity
public class User {

    @Id
    private Long id;
    private boolean admin;
    private String email;
    private String password;

    public boolean getAdmin() {
        return this.admin;
    }

    public User(boolean admin){
        this.admin = admin;
    }

}
