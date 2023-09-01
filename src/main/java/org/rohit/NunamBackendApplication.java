package org.rohit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "org.rohit")
public class NunamBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(NunamBackendApplication.class, args);
	}
}
