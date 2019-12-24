package com.example.demo.Entities;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Generated;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_CPTE",
discriminatorType=DiscriminatorType.STRING,length = 2)

public class Client implements Serializable {
	 @Id @GeneratedValue
private Long num;
private String nom;
private String email;
@OneToMany(mappedBy = "client",fetch=FetchType.LAZY)
private Collection<Compte>comptes;
public Client(String nom, String email) {
	super();

	this.nom = nom;
	this.email = email;
	
}


	
}
