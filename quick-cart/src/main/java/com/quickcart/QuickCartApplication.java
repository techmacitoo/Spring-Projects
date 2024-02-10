package com.quickcart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.*")
public class QuickCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickCartApplication.class, args);
	}

}
