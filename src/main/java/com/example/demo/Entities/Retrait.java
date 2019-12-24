package com.example.demo.Entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("R")
public class Retrait extends Operation {

public Retrait(Date opeartion,Double montant,Compte compte) {
	super(opeartion,montant,compte);
}
	
}
