package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao dao;

    public List getUsers() {
        return dao.getUsers();
    }
}
