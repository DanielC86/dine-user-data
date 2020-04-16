package com.daniel.czajka.dao;

import com.daniel.czajka.entity.Users;

import java.util.List;

public interface UsersDAO {

    public List<Users> findAll();

    //to find employee per id
    public Users findById(int theUserId);

    //to save new or update existing employee
    public void save(Users theUser);

    //to delete existing employee
    public void deleteById(int theUserId);

}
