package totorial.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import totorial.security.security.AppSecurityConfigProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppSecurityConfigProperties.class)
public class SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

}
