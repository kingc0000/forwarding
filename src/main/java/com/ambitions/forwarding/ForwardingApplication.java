package com.ambitions.forwarding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ImportResource("classpath*:/spring/application.xml")
@PropertySource(value = {"classpath:application.properties"}, ignoreResourceNotFound = true)
@MapperScan("com.ambitions.forwarding.app.mapper")
@ComponentScan("com.ambitions.forwarding")
public class ForwardingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForwardingApplication.class, args);

	}
}
