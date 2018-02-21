package com.mnsn.jenkins.Spring_boot_jenkins_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.mnsn")
public class SpringBootJenkinsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJenkinsDemoApplication.class, args);
	}
}
