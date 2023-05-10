package com.SpringBoot.Portofolio.service;

import com.SpringBoot.Portofolio.model.User;
import java.util.List;

public interface IUserService {

    public List<User> getUser();

    public void saveUser(User user);

    public void deleteUser(Long id);

    public User findUser(Long id);

    public User validarUser(User user, List<User> listaUsuarios);
}
