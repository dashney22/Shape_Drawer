package com.dashney.drawit.AutomatedDrawer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class AutomatedDrawerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutomatedDrawerApplication.class, args);
	}

}
