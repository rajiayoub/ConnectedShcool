package com.connected.school.persistence.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.util.*;

@Entity
@Table(name = "adresse")
public class Adresse  implements Serializable {
   

   private static final long serialVersionUID = 1L;


   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;
   
   @Column(name = "ligne1", nullable = true)
   private String ligne1;
   
   @Column(name = "ligne2", nullable = true)
   private String ligne2;
   
   @Column(name = "codePostal", nullable = true)
   private String codePostal;
   
   @Column(name = "priorite", nullable = true)
   private int priorite;
   
   @Column(name = "validite", nullable = true)
   private boolean validite;
   
   @Column(name = "dateFinValidite", nullable = true)
   private Date dateFinValidite;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getLigne1() {
	return ligne1;
}

public void setLigne1(String ligne1) {
	this.ligne1 = ligne1;
}

public String getLigne2() {
	return ligne2;
}

public void setLigne2(String ligne2) {
	this.ligne2 = ligne2;
}

public String getCodePostal() {
	return codePostal;
}

public void setCodePostal(String codePostal) {
	this.codePostal = codePostal;
}

public int getPriorite() {
	return priorite;
}

public void setPriorite(int priorite) {
	this.priorite = priorite;
}

public boolean isValidite() {
	return validite;
}

public void setValidite(boolean validite) {
	this.validite = validite;
}

public Date getDateFinValidite() {
	return dateFinValidite;
}

public void setDateFinValidite(Date dateFinValidite) {
	this.dateFinValidite = dateFinValidite;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}
   
   
  // public java.util.Collection<Ville> ville;
   
  // public Personne personne;
   
   
}