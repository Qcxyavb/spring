package com.qf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Person p1 = (Person)ac.getBean("person1");
        Person p2 = (Person)ac.getBean("person2");
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        Person bean = ac.getBean(Person.class);
        System.out.println(bean);
    }
}
