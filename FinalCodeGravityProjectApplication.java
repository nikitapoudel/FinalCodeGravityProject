package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan ({"com.FinalCodeGravityProject.aspects", "com.FinalCodeGravityProject.controller", "com.FinalCodeGravityProject.service"})
@EnableJpaRepositories("com.FinalCodeGravityProject.dataLayer")
@EntityScan({"com.FinalCodeGravityProject.dataLayer"})
@EnableTransactionManagement
public class FinalCodeGravityProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalCodeGravityProjectApplication.class, args);
	}

}
