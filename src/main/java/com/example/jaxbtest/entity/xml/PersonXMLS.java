package com.example.jaxbtest.entity.xml;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;

import java.util.List;

@XmlRootElement
@Getter
public class PersonXMLS {

    @XmlElement(name = "person")
    List<PersonXML> person;

    public void setPersonXMLS(List<PersonXML> personXMLS) {
        this.person = personXMLS;
    }

}
