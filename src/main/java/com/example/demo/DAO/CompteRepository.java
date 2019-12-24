package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, Long> {

}
