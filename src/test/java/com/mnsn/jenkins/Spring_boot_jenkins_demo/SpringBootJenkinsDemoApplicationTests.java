package com.mnsn.jenkins.Spring_boot_jenkins_demo;

import com.mnsn.service.SampleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootJenkinsDemoApplicationTests {


	@Autowired
	SampleService sampleService;
	@Test
	public void contextLoads() {
		System.out.println("***********TestCaseStarted************");
		System.out.println(sampleService.sampleService());
		System.out.println("***********TestCaseEnded************");

	}

}
