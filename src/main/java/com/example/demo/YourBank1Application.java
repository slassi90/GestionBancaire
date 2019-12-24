package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.DAO.ClientRepository;
import com.example.demo.DAO.CompteRepository;
import com.example.demo.DAO.OperationRepository;
import com.example.demo.Entities.Client;
import com.example.demo.Entities.Compte;
import com.example.demo.Entities.CompteCourant;
import com.example.demo.Entities.Versement;

@SpringBootApplication
public class YourBank1Application implements CommandLineRunner {
	@Autowired
	private ClientRepository clientRepository;
	public static void main(String[] args) {
		SpringApplication.run(YourBank1Application.class, args);
		 
		
	}

	@Override
	public void run(String... args) throws Exception {
	// System.out.print("ggg");
		Client c1 = clientRepository.save(new Client("Achraf","Achraf@gmail.com"));
		//Compte cpt1 = compteRepository.save(new CompteCourant("abcd", new Date(), 100000, c1, 4000));
		//Compte cpt1 = compteRepository.save(new CompteCourant("cptachraf",new Date(),3000,c1,2300));
		
		

		
		
		}
		
	}

