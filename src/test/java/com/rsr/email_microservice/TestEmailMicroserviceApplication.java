package com.rsr.email_microservice;

import org.springframework.boot.SpringApplication;

public class TestEmailMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.from(EmailMicroserviceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
