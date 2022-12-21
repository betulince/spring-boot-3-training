package com.in28minutes.spring.learnspringframework.enterprise.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWebController {

    @Autowired
    private BusinessService businessService;

    public long returnValueFromBusinessService() {
        return businessService.calculateSum();
    }

}

// this is how you got an enterprise application, you would have a business layer where there's a business service; data layer, where there is a data; web layer where you have the controllers

