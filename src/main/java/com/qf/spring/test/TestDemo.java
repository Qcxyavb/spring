package com.qf.spring.test;

import com.qf.Person;
import com.qf.spring.web.UserServlet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
    public static void main(String[] args) {
        System.out.println(test(1));
        System.out.println(test(1.2588));
        System.out.println(test("afsgdf"));

    }

    public static <T> T test(T i){
        return i;
    }
}
