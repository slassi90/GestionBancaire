package com.example.demo.Entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@DiscriminatorValue("CE")
public class CompteEpargne extends Compte {
private double taux;

public CompteEpargne(String codeCompte, Date dateCreation, double solde, Client client, double taux) {
	super(codeCompte, dateCreation, solde, client);
	this.taux = taux;
}
	
}
