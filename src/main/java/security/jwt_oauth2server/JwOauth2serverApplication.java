package security.jwt_oauth2server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import security.jwt_oauth2server.configs.RsaKeyProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class JwOauth2serverApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwOauth2serverApplication.class, args);
	}

}
