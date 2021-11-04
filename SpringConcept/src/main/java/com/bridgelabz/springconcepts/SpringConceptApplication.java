package com.bridgelabz.springconcepts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bridgelabz.springconcepts.component.DemoBean;
import com.bridgelabz.springconcepts.component.EmployeeBean;

@SpringBootApplication
public class SpringConceptApplication {
	public static final Logger logger = LoggerFactory.getLogger(SpringConceptApplication.class);

	public static void main(String[] args) {
		logger.debug("Welcome to Spring Concept Domo");
		ApplicationContext context = SpringApplication.run(SpringConceptApplication.class, args);
		logger.debug("Checking Context: {}", context.getBean(DemoBean.class));
		logger.debug("\n*** example of logger ***");
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(102);
		employeeBean.setEname("Spring Framework");
		employeeBean.showEmployeeDetails();
	}

}
