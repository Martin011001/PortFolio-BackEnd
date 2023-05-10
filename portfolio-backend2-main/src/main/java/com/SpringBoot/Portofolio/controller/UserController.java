package com.SpringBoot.Portofolio.controller;

import com.SpringBoot.Portofolio.model.SobreMi;
import com.SpringBoot.Portofolio.model.User;
import com.SpringBoot.Portofolio.service.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://portfolio-df72c.web.app")
public class UserController {

    @Autowired
    private IUserService interUser;

    @GetMapping("/user/traer")
    public List<User> getUser() {
        return interUser.getUser();
    }

    @GetMapping("/user/{id}")
    public User findUser(@PathVariable Long id) {
        return interUser.findUser(id);
    }

    @PostMapping("/user/crear")
    public String createUser(@RequestBody User user) {
        interUser.saveUser(user);
        return "El User fue creada correctamente";
    }

    @DeleteMapping("/user/borrar/{id}")
    public String deleteUser(@PathVariable Long id) {
        interUser.deleteUser(id);
        return "El User fue eliminado correctamente";
    }

    @PutMapping("/user/editar/{id}")
    public User editUser(@PathVariable Long id,
            @RequestBody User user) {
        user.setId(id);
        interUser.saveUser(user);
        return user;
    }
    
    @PostMapping("/user/login")
    public User validarUser(@RequestBody User user) {
        User usuarioDevolver = null;
        List<User> listaUsuarios = this.getUser();
        usuarioDevolver = interUser.validarUser(user, listaUsuarios);
        
        return usuarioDevolver;
    }
}
