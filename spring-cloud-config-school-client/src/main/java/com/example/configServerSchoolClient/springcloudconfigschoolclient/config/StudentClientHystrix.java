package com.example.configServerSchoolClient.springcloudconfigschoolclient.config;

import com.example.configServerSchoolClient.springcloudconfigschoolclient.client.StudentClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class StudentClientHystrix implements StudentClient {


    @Override
    public String getStudents(@PathVariable String schoolname) {
        return "Teknik hata koçum";
    }

    @Override
    public String greeting() {
        return "Teknik hata koçum";
    }
}
