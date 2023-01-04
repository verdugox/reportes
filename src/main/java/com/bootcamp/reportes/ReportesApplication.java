package com.bootcamp.reportes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReportesApplication implements CommandLineRunner {

	@Override
	public void run(String args[]) throws Exception
	{
		System.out.println("Probando SpringBoot con GitHub Actions Deploy Azure Web App");
	}

	public static void main(String[] args) {
		SpringApplication.run(ReportesApplication.class, args);
	}

}
