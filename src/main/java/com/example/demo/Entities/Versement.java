package com.example.demo.Entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("V")
public class Versement extends Operation {

	public Versement(Date operation,Double montant,Compte compte) {
		super(operation,montant,compte);
	}
}
