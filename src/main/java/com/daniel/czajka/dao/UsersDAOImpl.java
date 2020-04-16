package com.daniel.czajka.dao;

import com.daniel.czajka.entity.Users;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UsersDAOImpl implements UsersDAO {

    private EntityManager entityManager;


    @Autowired
    public UsersDAOImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    public List<Users> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);

        //create query
        Query<Users> theUsersQuery = currentSession.createQuery("from Users", Users.class);

        //execute theQuery
        List<Users> allUsers = theUsersQuery.getResultList();

        //and return the result
        return allUsers;
    }

    @Override
    public Users findById(int theUserId) {
        return null;
    }

    @Override
    public void save(Users theUser) {

    }

    @Override
    public void deleteById(int theUserId) {

    }
}
