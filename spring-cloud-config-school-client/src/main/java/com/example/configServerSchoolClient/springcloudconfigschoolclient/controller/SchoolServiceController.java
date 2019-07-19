package com.example.configServerSchoolClient.springcloudconfigschoolclient.controller;

import com.example.configServerSchoolClient.springcloudconfigschoolclient.client.StudentClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RefreshScope
@RestController
public class SchoolServiceController {


    @Autowired
    StudentClient studentClient ;

    @Value("${app.service-name}")
    private String serviceName;

    @GetMapping("/service")
    public String getServiceName() {
        return "service name [" + this.serviceName + "]";
    }

    @RequestMapping(value = "/getSchoolDetails/{schoolname}", method = RequestMethod.GET)
    public String getStudent(@PathVariable String schoolname){
        return "School Name -  " + schoolname + " \n Student Details " + studentClient.getStudents(schoolname);
    }

    @RequestMapping(value = "/get-greeting", method = RequestMethod.GET)
    public String greeting() {
        return "Hello Greeting : " + studentClient.greeting();
    }
}
