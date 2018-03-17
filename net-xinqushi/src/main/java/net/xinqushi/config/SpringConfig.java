package net.xinqushi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="net.xinqushi.config")
public class SpringConfig {
	@Bean
	public UserDAO getUserDAO(){
		return new UserDAO();
	}
}
