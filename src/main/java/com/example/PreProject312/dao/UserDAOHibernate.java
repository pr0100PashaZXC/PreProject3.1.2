package com.example.PreProject312.dao;

import com.example.PreProject312.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.validation.Valid;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Component
@Transactional
public class UserDAOHibernate implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public UserDAOHibernate(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<User> index() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public User show(long id) {
        return entityManager.find(User.class, id);

    }

    @Override
    public void update(@Valid User user) {
        System.out.println(user.toString());
        entityManager.merge(user);
        System.out.println(user.toString());
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public void delete(long id) {
        entityManager.remove(show(id));

    }
}