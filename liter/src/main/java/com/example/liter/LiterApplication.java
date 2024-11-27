package com.example.liter;

import com.example.liter.principal.Principal;
import com.example.liter.reposit.fraseReposit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LiterApplication.class, args);
	}

	@Autowired
	private fraseReposit reposit;


	@Autowired
	private com.example.liter.reposit.authorReposit authorReposit;

	@Override
	public void run(String... args) throws Exception {

		Principal princip = new Principal(reposit,authorReposit);
		princip.exibeMenu();

    }

}