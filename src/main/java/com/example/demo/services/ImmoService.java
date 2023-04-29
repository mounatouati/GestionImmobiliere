package com.example.demo.services;


import com.example.demo.entities.Locataire;
import com.example.demo.entities.Logement;
import com.example.demo.entities.Proprietaire;

public interface ImmoService {
	Locataire saveLocataire(Locataire locataire);
	Proprietaire saveProprietaire(Proprietaire proprietaire);
	Logement saveLogement(Logement logement);
	void  mergeLogementProprietaire(Logement logement, Proprietaire proprietaire);
    void  mergeLogementLocataire(Logement logement, Locataire locataire);
}
