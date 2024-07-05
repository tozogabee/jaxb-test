package com.example.jaxbtest;

import com.example.jaxbtest.service.PersonEntityService;
import jakarta.xml.bind.annotation.XmlTransient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JaxbTestApplication implements CommandLineRunner {

    @Autowired
    private PersonEntityService personEntityService;

    public static void main(String[] args) {
        SpringApplication.run(JaxbTestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        personEntityService.marshalling();
    }
}
