package com.api.practice.project.services;

import com.api.practice.project.model.Person;
import org.springframework.stereotype.Component;

@Component
public class ServiceImpl implements Service {

    @Override
    public Person getInfo() {
        Person person = new Person();
        person.setFirstName("Diether");
        person.setLastName("San Pedro");
        person.setAge("25");

        return person;
    }
}
