package com.example.demo;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entities.Locataire;
import com.example.demo.entities.Logement;
import com.example.demo.entities.Proprietaire;
import com.example.demo.services.ImmoService;

@SpringBootApplication
public class GestionImmobiliereApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionImmobiliereApplication.class, args);
	}
	@Bean
    CommandLineRunner start(ImmoService immoService) {
        return args -> {
            // Créer un locataire
           // Locataire locataire = new Locataire("Nom", "Prénom", "01/01/1990", "Adresse");
            Locataire locataire1 = new Locataire();
            locataire1.setDateNaissance(new Date());
            locataire1.setAdresse("mim@live.fr");
            locataire1.setNom("Momo");
            locataire1.setPrenom("TALEB");
            immoService.saveLocataire(locataire1);
            Locataire locataire2 = new Locataire();
            locataire2.setDateNaissance(new Date());
            locataire2.setAdresse("ddd@live.fr");
            locataire2.setNom("ddd");
            locataire2.setPrenom("ddd");
            immoService.saveLocataire(locataire2);
            Locataire locataire3 = new Locataire();
            locataire3.setDateNaissance(new Date());
            locataire3.setAdresse("sss@live.fr");
            locataire3.setNom("Mssss");
            locataire3.setPrenom("qqq");
            immoService.saveLocataire(locataire3);
            Locataire locataire = new Locataire();
            locataire.setDateNaissance(new Date());
            locataire.setAdresse("mim@live.fr");
            locataire.setNom("Momo");
            locataire.setPrenom("TALEB");
            immoService.saveLocataire(locataire);
            Proprietaire proprietaire = new Proprietaire();
            proprietaire.setDateNaissance(new Date());
            proprietaire.setEmail("sakem@");
            proprietaire.setNom("salem");
            proprietaire.setPrenom("ahmed");
            immoService.saveProprietaire(proprietaire);
            // Créer un propriétaire
           // Proprietaire proprietaire = new Proprietaire("Nom", "Prénom", "email@example.com", "02/03/1990");

            // Créer un logement
            Logement logement = new Logement();
            logement.setSurface(125);
            logement.setAdresse("5 mail pierres desproges");
            logement.setDateContruction("15/05/1989");
           // logement.setLocataire(locataire1);
            immoService.saveLogement(logement);
            immoService.mergeLogementProprietaire(logement, proprietaire);
            immoService.mergeLogementLocataire(logement, locataire1);
           // Logement logement = new Logement(100.50, "Adresse du logement", "01/01/2000",locataire1,proprietaire);
           
            // Attribuer le locataire et le propriétaire au logement
          //  logement.setLocataire(locataire);
           // logement.setProprietaire(proprietaire);
        };
    }
}
