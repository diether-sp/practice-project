package com.api.practice.project.services;

import com.api.practice.project.model.Person;
import org.springframework.stereotype.Component;

@Component
public class ServiceImpl implements Service {

    private Person person = new Person();

    @Override
    public Person getInfo() {
        return person;
    }

    @Override
    public Person postInfo(Person postPerson){
        person = postPerson;
        return person;
    }


}
