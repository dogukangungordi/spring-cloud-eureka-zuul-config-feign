package com.example.configServerSchoolClient.springcloudconfigschoolclient;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients("com.example.configServerSchoolClient.springcloudconfigschoolclient.client")
public class SpringCloudConfigSchoolClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigSchoolClientApplication.class, args);
	}

}
