package com.example.jaxbtest.entity.repository;

import com.example.jaxbtest.entity.model.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {



}
