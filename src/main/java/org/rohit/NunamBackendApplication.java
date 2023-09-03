package org.rohit;

import org.rohit.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class NunamBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(NunamBackendApplication.class, args);
	}
}
