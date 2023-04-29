package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entities.Locataire;
//@RepositoryRestResource
public interface LocataireRepository extends JpaRepository<Locataire, Long>{

}
