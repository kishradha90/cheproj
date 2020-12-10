package com.cdac.boot.GrievanceRedressalSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= 
		{"com.cdac.boot.GrievanceRedressalSystem.controller",
		 "com.cdac.boot.GrievanceRedressalSystem.service" })
public class GrievanceRedressalSystemApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(GrievanceRedressalSystemApplication.class, args);
	}

}
