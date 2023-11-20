package com.example.demo;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.origin.SystemEnvironmentOrigin;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class}) //排除spring security的預設登入
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
