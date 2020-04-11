package com.capg.labook;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.capg.labook")
@PropertySource("app.properties")
public class EmployeeConfiguration {

	
}
