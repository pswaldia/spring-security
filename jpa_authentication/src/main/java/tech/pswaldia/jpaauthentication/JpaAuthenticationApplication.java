package tech.pswaldia.jpaauthentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import tech.pswaldia.jpaauthentication.daos.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class JpaAuthenticationApplication {
	public static void main(String[] args) {
		SpringApplication.run(JpaAuthenticationApplication.class, args);
	}

}
