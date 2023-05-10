package com.SpringBoot.Portofolio.service;

import com.SpringBoot.Portofolio.model.SobreMi;
import com.SpringBoot.Portofolio.model.User;
import com.SpringBoot.Portofolio.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository UserRepository;

    @Override
    public List<User> getUser() {
        List<User> listaUser = UserRepository.findAll();
        return listaUser;
    }

    @Override
    public void saveUser(User user) {
        UserRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        UserRepository.deleteById(id);
    }

    @Override
    public User findUser(Long id) {
        User user = UserRepository.findById(id).orElse(null);
        return user;
    }

    @Override
    public User validarUser(User user, List<User> listaUsuarios) {
        User usuarioDevolver = null;
        for (User usuario : listaUsuarios) {
            if (user.getEmail().equals(usuario.getEmail())) {
                if (user.getPassword().equals(usuario.getPassword())) {
                    if (usuario.getAdmin()) {
                        usuarioDevolver = usuario;
                        usuarioDevolver.setPassword("");
                        usuarioDevolver.setEmail("");

                    }
                }
            }
        }
        return usuarioDevolver;
    }
}
