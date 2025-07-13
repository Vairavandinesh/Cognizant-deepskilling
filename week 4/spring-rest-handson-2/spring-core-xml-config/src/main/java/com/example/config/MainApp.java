package com.example.config;

import com.example.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AppConfig.xml");
        Country country = context.getBean("country", Country.class);
        country.printName();
    }
}
