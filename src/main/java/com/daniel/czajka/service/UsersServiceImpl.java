package com.daniel.czajka.service;

import com.daniel.czajka.dao.UsersDAO;
import com.daniel.czajka.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService{

    public UsersDAO usersDAO;

    @Autowired
    public UsersServiceImpl(UsersDAO theUsersDAO){
        usersDAO = theUsersDAO;
    }

    @Override
    @Transactional
    public List<Users> findAll() {
        return usersDAO.findAll();
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
