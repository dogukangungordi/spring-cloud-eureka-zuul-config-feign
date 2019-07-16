package com.example.configServerSchoolClient.springcloudconfigschoolclient.client;

import com.example.configServerSchoolClient.springcloudconfigschoolclient.config.StudentClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "student-service", fallback = StudentClientHystrix.class)
public interface StudentClient {

    @RequestMapping(value = "/getStudentDetailsForSchool/{schoolname}", method = RequestMethod.GET, produces = "application/json")
    String getStudents(@PathVariable String schoolname);


    @RequestMapping(value = "/greeting", method = RequestMethod.GET, produces = "application/json")
    String greeting();

}
