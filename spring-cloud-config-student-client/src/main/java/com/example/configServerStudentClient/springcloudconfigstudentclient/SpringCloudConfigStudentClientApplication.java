package com.example.configServerStudentClient.springcloudconfigstudentclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudConfigStudentClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigStudentClientApplication.class, args);
	}

}
