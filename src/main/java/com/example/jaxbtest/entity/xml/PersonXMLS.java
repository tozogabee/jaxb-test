package com.example.jaxbtest.entity.xml;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement(name = "people")
public class PersonXMLS {


    List<PersonXML> people;

    public void setPersonXMLS(List<PersonXML> personXMLS) {
        this.people = personXMLS;
    }

    @XmlElement(name = "person")
    public List<PersonXML> getPeople() {
        return people;
    }
}
