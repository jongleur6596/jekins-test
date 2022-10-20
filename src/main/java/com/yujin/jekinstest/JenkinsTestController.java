package com.yujin.jekinstest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsTestController {

    @Autowired
    private JenkinsTestService jenkinsTestService;

    @RequestMapping("/name")
    String name(@RequestParam("name") String name){
        return "My name is "+name;
    }


    @RequestMapping("/age")
    String name(@RequestParam("year") Integer year){
        return "I'm "+ jenkinsTestService.getAge(year) + " years old";
    }

}
