package com.qf.spring.service;

import com.qf.Person;
import com.qf.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public Person get(int id) {
        return userDao.get(id);
    }
}
