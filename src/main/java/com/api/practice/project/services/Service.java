package com.api.practice.project.services;

import com.api.practice.project.model.Person;

public interface Service {
    Person getInfo();
    Person postInfo(Person postPerson);
}
