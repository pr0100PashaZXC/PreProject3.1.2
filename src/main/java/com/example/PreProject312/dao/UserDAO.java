package com.example.PreProject312.dao;


import com.example.PreProject312.model.User;

import java.util.List;

public interface UserDAO {
    public List<User> index();

    public User show(long id);

    public void update(User updatedUser);
    public  void save(User user);

    void delete(long id);
}
