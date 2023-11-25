package com.Products.ps.setup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.Products.ps.*")
@ComponentScan(basePackages = { "com.Products.ps.*" })
@EntityScan("com.Products.ps.*")   
public class PsSetupApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsSetupApiApplication.class, args);
	}

}
