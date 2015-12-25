package com.connected.school.persistence.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "ville")
public class Ville  implements Serializable {

   private static final long serialVersionUID = 1L;


   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;
   


   @Column(name = "codeVille", nullable = true)
   private String codeVille;

   @Column(name = "nomVille", nullable = true)
   private String nomVille;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getCodeVille() {
	return codeVille;
}

public void setCodeVille(String codeVille) {
	this.codeVille = codeVille;
}

public String getNomVille() {
	return nomVille;
}

public void setNomVille(String nomVille) {
	this.nomVille = nomVille;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}
   

  
  // public Region region;
   
   
   //public Adresse adresse;
   
   
}