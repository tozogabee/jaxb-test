package com.example.jaxbtest.entity.xml.pojo.person;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "person")
public class PersonXML {

    private String name;

    private int age;

    private String email;

    private String id;


    @XmlSchemaType(name = "string")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlSchemaType(name = "int")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @XmlSchemaType(name = "string")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlAttribute
    @XmlSchemaType(name = "string")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

