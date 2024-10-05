package com.luis.firststepjavaspring.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luis.firststepjavaspring.exceptions.ResourceNotFoundException;
import com.luis.firststepjavaspring.model.Person;
import com.luis.firststepjavaspring.repositories.PersonRepository;

@Service
public class PersonServices {

    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    @Autowired
    PersonRepository repository;

    public List<Person> findAll() {
        logger.info("Searching all people! ");
        return repository.findAll();
    }

    public Person findById(Long id) {
        logger.info("Searching one person! ");

        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
    }

    public Person create(Person person) {
        logger.info("Creating one person!");
        return repository.save(person);
    }

    public Person update(Person person) {
        logger.info("Update one person!");
        var entity = repository.findById(person.getId())
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());
        return repository.save(person);
    }

    public void delete(Long id) {
        logger.info("Deleting one person!");
        var entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
        repository.delete(entity);
    }
    // para caso eu consigo mockar algo para testar
    // mock = é como se fosse uns suporte de construçao
    // serve para ser como se fosse um pilar substituto
    // private Person mockPerson(int i) {

    // Person person = new Person();
    // person.setId(counter.incrementAndGet());
    // person.setFirstName("PersonName " + i);
    // person.setLastName("Last Name " + i);
    // person.setAddress("Some address in Brasil " + i);
    // person.setGender("Male");
    // return person;
    // }
}
