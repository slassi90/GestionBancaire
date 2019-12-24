package com.example.demo.Entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("CC")
public class CompteCourant extends Compte {
	private double decouvert;

	public CompteCourant(String codeCompte, Date dateCreation, double solde, Client client,
			 double decouvert) {
		super(codeCompte, dateCreation, solde, client);
		this.decouvert = decouvert;
	} 

	 
	
}
