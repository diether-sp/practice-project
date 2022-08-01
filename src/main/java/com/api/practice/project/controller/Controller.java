package com.api.practice.project.controller;

import com.api.practice.project.model.Person;
import com.api.practice.project.services.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class Controller {

    private final Service service;

    @GetMapping("/getInfo")
    public Person getInfo(){
        return service.getInfo();
    }

    @PostMapping("/postInfo/{firstName}")
    public Person postInfo(@PathVariable String firstName, @RequestParam String lastName, @RequestBody Person personAge ){
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(personAge.getAge());
        return service.postInfo(person);
    }
}
