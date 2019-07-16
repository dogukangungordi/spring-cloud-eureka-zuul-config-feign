package com.example.zuulServer.springzuulserver;

import com.example.zuulServer.springzuulserver.filter.ErrorFilter;
import com.example.zuulServer.springzuulserver.filter.PostFilter;
import com.example.zuulServer.springzuulserver.filter.PreFilter;
import com.example.zuulServer.springzuulserver.filter.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class SpringZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringZuulServerApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}
