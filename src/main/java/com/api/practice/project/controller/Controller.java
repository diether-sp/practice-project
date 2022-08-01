package com.api.practice.project.controller;

import com.api.practice.project.model.Person;
import com.api.practice.project.services.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class Controller {

    private final Service service;

    @GetMapping("/getInfo")
    public Person getInfo(){
        return service.getInfo();
    }
}
