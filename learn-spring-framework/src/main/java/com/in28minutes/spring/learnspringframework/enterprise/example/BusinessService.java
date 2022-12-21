package com.in28minutes.spring.learnspringframework.enterprise.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.util.List;

@Component
public class BusinessService {

    private DataService dataService;

    @Autowired
    public BusinessService(DataService dataService) {
        super();
        System.out.println("constructor injection");
        this.dataService = dataService;
    }

    /**@Autowired
    public void setDataService(DataService dataService) {
        System.out.println("setter injection!");
        this.dataService = dataService;
    }**/

    public long calculateSum() {
        List<Integer> data = dataService.getData();
        return data.stream().reduce(Integer::sum).get();
    }
}
