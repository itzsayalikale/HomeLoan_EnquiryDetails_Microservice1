package com.main.homeloan.enquiry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HomeLoanEnquiryDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeLoanEnquiryDetailsApplication.class, args);
	}

}
