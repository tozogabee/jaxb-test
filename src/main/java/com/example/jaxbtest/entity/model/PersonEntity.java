package com.example.jaxbtest.entity.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Person")
@Getter
@Setter
public class PersonEntity {

    @Id
    Long id;

    @Column(name = "name")
    private String name;

    @Column(name= "email")
    private String email;

    @Column(name = "age")
    private int age;


}
