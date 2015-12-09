package com.connected.school.persistence.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "personnelAdministratif")
@PrimaryKeyJoinColumn(name="idPersonne")
public class PersonnelAdministratif   extends Personne implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "id", nullable = false)
//	private Long id;
//	
	@Column(name = "matricule", nullable = true)
   private String matricule;
	@Column(name = "fonction", nullable = true)
   private String fonction;
	
	@Column(name = "service", nullable = true)
   private String service;

//public Long getId() {
//	return id;
//}
//
//public void setId(Long id) {
//	this.id = id;
//}

public String getMatricule() {
	return matricule;
}

public void setMatricule(String matricule) {
	this.matricule = matricule;
}

public String getFonction() {
	return fonction;
}

public void setFonction(String fonction) {
	this.fonction = fonction;
}

public String getService() {
	return service;
}

public void setService(String service) {
	this.service = service;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}
   
   
   
   
}