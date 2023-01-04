package br.com.ecore.roles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.com.ecore.roles")
public class RolesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RolesApplication.class, args);
	}

}
