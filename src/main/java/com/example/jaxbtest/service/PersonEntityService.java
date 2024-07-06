package com.example.jaxbtest.service;

import com.example.jaxbtest.entity.model.PersonEntity;
import com.example.jaxbtest.entity.repository.PersonRepository;
import com.example.jaxbtest.entity.xml.pojo.person.PersonXML;
import com.example.jaxbtest.entity.xml.pojo.person.PersonXMLS;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonEntityService {

    @Autowired
    private PersonRepository personRepository;


    private List<PersonEntity> getAllPeople() {
        return this.personRepository.findAll();
    }

    public void marshallingPOJOToXSD() throws JAXBException {
        List<PersonEntity> personEntities = this.getAllPeople();
        List<PersonXML> result = new ArrayList<>();
        PersonXMLS personXMLS = new PersonXMLS();
        File file = new File("src/main/resources/output/Person.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(PersonXMLS.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        for (PersonEntity person : personEntities) {
            PersonXML personXML = new PersonXML();
            personXML.setId(String.valueOf(person.getId()));
            personXML.setAge(person.getAge());
            personXML.setEmail(person.getEmail());
            result.add(personXML);
        }
        personXMLS.setPersonXMLS(result);
        jaxbMarshaller.marshal(personXMLS, file);
        jaxbMarshaller.marshal(personXMLS, System.out);


    }


}
