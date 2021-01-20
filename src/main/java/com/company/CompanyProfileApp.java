package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.company.controller.CompanyController;
import com.company.service.CompanyProfileService;
import com.company.service.impl.CompanyProfileServiceImpl;

@SpringBootApplication
@ComponentScan(basePackageClasses = {CompanyController.class, CompanyProfileService.class, CompanyProfileServiceImpl.class})
public class CompanyProfileApp {

	public static void main(String[] args) {
		SpringApplication.run(CompanyProfileApp.class, args);
	}

}
