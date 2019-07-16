package com.example.configServerStudentClient.springcloudconfigstudentclient.contoller;


import org.springframework.web.bind.annotation.RequestMapping;

public interface GreetingController {
    @RequestMapping("/greeting")
    String greeting();
}