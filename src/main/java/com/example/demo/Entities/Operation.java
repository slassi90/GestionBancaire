package com.example.demo.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn(name="TYPE_OP",discriminatorType =DiscriminatorType.STRING,length = 1)
public abstract class Operation implements Serializable {
	@Id @GeneratedValue
	private Long numero;
	private Date dateoperation;
	private double montant;
	@ManyToOne
	@JoinColumn(name="CODE_CPTE")	
	private Compte compte;
	public Operation( Date dateoperation, double montant, Compte compte) {
		this.dateoperation = dateoperation;
		this.montant = montant;
		this.compte = compte;
	}
	
	

}
