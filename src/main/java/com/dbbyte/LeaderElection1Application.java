package com.dbbyte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@SpringBootApplication
public class LeaderElection1Application {

	public static void main(String[] args) {
		SpringApplication.run(LeaderElection1Application.class, args);
	}
}
