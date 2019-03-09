package com.example.demospringbootfirst.controller;

import com.example.demospringbootfirst.model.Person;
import com.example.demospringbootfirst.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
@RestController
public class PersonController {
    @Resource
    PersonService personService;

    @GetMapping("person/{id}")
    public Person getPersonById(@PathVariable("id") Integer id){
        return personService.selectByPrimaryKey(id);
    }
}
