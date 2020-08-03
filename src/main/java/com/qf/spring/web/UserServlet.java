package com.qf.spring.web;

import com.qf.Person;
import com.qf.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserServlet {

    @Autowired
    private UserService userService;

    public Person get(int id) {
        Person user = userService.get(id);
        return user;
    }
}
