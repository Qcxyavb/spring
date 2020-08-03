package com.qf.spring.dao;

import com.qf.Person;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    public Person get(int id) {
        Person person = new Person();
        person.setAge(id);
        person.setName("1234");
        person.setInfo("qwdefwregtrhytu");
        return person;
    }
}
