package com.example.configServerSchoolClient.springcloudconfigschoolclient.controller;

import com.example.configServerSchoolClient.springcloudconfigschoolclient.client.StudentClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolServiceController {


    @Autowired
    StudentClient studentClient ;

    @RequestMapping(value = "/getSchoolDetails/{schoolname}", method = RequestMethod.GET)
    public String getStudent(@PathVariable String schoolname){
        return "School Name -  " + schoolname + " \n Student Details " + studentClient.getStudents(schoolname);
    }

    @RequestMapping(value = "/get-greeting", method = RequestMethod.GET)
    public String greeting() {
        return "Hello Greeting : " + studentClient.greeting();
    }
}
