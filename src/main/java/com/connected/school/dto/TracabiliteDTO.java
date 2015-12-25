package com.connected.school.dto;

import java.io.Serializable;

import javax.persistence.Column;

import java.util.*;


public class TracabiliteDTO   extends AbstractDTO implements Serializable {


   private static final long serialVersionUID = 1L;


   private Long id;
   

   private int idEntite;



   @Column(name = "nameEntite", nullable = true)
   private String nameEntite;

   @Column(name = "dateCreation", nullable = true)
   private Date dateCreation;

   @Column(name = "dateRadiation", nullable = true)
   private Date dateRadiation;

   @Column(name = "dateModification", nullable = true)
   private Date dateModification;

   @Column(name = "userCreation", nullable = true)
   private String userCreation;

   @Column(name = "userRadiation", nullable = true)
   private String userRadiation;

   @Column(name = "userModification", nullable = true)
   private String userModification;

   @Column(name = "valeurApres", nullable = true)
   private String valeurApres;

   @Column(name = "valeurAvant", nullable = true)
   private String valeurAvant;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public int getIdEntite() {
	return idEntite;
}

public void setIdEntite(int idEntite) {
	this.idEntite = idEntite;
}

public String getNameEntite() {
	return nameEntite;
}

public void setNameEntite(String nameEntite) {
	this.nameEntite = nameEntite;
}

public Date getDateCreation() {
	return dateCreation;
}

public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}

public Date getDateRadiation() {
	return dateRadiation;
}

public void setDateRadiation(Date dateRadiation) {
	this.dateRadiation = dateRadiation;
}

public Date getDateModification() {
	return dateModification;
}

public void setDateModification(Date dateModification) {
	this.dateModification = dateModification;
}

public String getUserCreation() {
	return userCreation;
}

public void setUserCreation(String userCreation) {
	this.userCreation = userCreation;
}

public String getUserRadiation() {
	return userRadiation;
}

public void setUserRadiation(String userRadiation) {
	this.userRadiation = userRadiation;
}

public String getUserModification() {
	return userModification;
}

public void setUserModification(String userModification) {
	this.userModification = userModification;
}

public String getValeurApres() {
	return valeurApres;
}

public void setValeurApres(String valeurApres) {
	this.valeurApres = valeurApres;
}

public String getValeurAvant() {
	return valeurAvant;
}

public void setValeurAvant(String valeurAvant) {
	this.valeurAvant = valeurAvant;
}



}