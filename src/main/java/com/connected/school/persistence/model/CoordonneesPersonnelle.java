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
@Table(name = "coordonneesPersonnelle")
public class CoordonneesPersonnelle  implements Serializable {


   private static final long serialVersionUID = 1L;


   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;
   


   @Column(name = "telephone1", nullable = true)
   private String telephone1;

   @Column(name = "telephone2", nullable = true)
   private String telephone2;

   @Column(name = "fixe", nullable = true)
   private String fixe;

   @Column(name = "bureau", nullable = true)
   private String bureau;

   @Column(name = "adresseMail", nullable = true)
   private String adresseMail;

   @Column(name = "validite", nullable = true)
   private Boolean validite;
   
   @Column(name = "dateFinValidite", nullable = true)
   private Date dateFinValidite;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getTelephone1() {
	return telephone1;
}

public void setTelephone1(String telephone1) {
	this.telephone1 = telephone1;
}

public String getTelephone2() {
	return telephone2;
}

public void setTelephone2(String telephone2) {
	this.telephone2 = telephone2;
}

public String getFixe() {
	return fixe;
}

public void setFixe(String fixe) {
	this.fixe = fixe;
}

public String getBureau() {
	return bureau;
}

public void setBureau(String bureau) {
	this.bureau = bureau;
}

public String getAdresseMail() {
	return adresseMail;
}

public void setAdresseMail(String adresseMail) {
	this.adresseMail = adresseMail;
}

public Boolean getValidite() {
	return validite;
}

public void setValidite(Boolean validite) {
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
   
   
   //public Personne personne;
   
   
}