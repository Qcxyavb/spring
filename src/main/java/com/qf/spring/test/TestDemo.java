package com.qf.spring.test;

import com.qf.Person;
import com.qf.spring.web.UserServlet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
    public static void main(String[] args) {
        ApplicationContext context  = new ClassPathXmlApplicationContext("classpath:applicationContext-annotation.xml");
        UserServlet bean = context.getBean(UserServlet.class);
        Person person = bean.get(1);
        System.out.println(person);

    }
}
