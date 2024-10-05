package com.luis.firststepjavaspring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.luis.firststepjavaspring.model.Person;
import com.luis.firststepjavaspring.services.PersonServices;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServices service;

    @GetMapping(value = "/{id}", produces = "application/json")
    public Person findById(
            @PathVariable(value = "id") Long id)
            throws Exception {
        return service.findById(id);
    }

    @GetMapping(produces = "application/json")
    public List<Person> findAll() {
        return service.findAll();
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public Person create(
            @RequestBody Person person)
            throws Exception {
        return service.create(person);
    }

    @PutMapping(consumes = "application/json", produces = "application/json")
    public Person update(
            @RequestBody Person person)
            throws Exception {
        return service.update(person);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(
            @PathVariable(value = "id") Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}