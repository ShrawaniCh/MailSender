package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.EmailSenderService;

@SpringBootApplication
public class SpringBootSendingEmailDemoApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext applicationContext=SpringApplication.run(SpringBootSendingEmailDemoApplication.class, args);
		 EmailSenderService emailSenderService = applicationContext.getBean(EmailSenderService.class);
		 emailSenderService.sendEmail("chaudharishrawani118@gmail.com","shrawanibc@gmaiAl.com","Sending an email","Hello");
	}
		
	}


