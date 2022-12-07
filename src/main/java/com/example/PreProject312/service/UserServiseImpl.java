package com.example.PreProject312.service;

import com.example.PreProject312.dao.UserDAO;
import com.example.PreProject312.model.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class UserServiseImpl implements UserService{

    private final UserDAO userDAO;

    @Autowired
    public UserServiseImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> index() {
        return userDAO.index();
    }

    @Override
    public User show(long id) {
        return userDAO.show(id);
    }

    @Override
    public void update(@Valid User user) {
        userDAO.update(user);
    }

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public void delete(long id) {
        userDAO.delete(id);
    }
}
