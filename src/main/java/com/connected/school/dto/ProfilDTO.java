package com.connected.school.dto;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import java.util.*;



public class ProfilDTO  extends AbstractDTO implements Serializable {
   
	
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;
	
	
	@Column(name = "loginUser", nullable = true)
   private String loginUser;
   
	@Column(name = "pwdUser", nullable = true)
   private String pwdUser;
   
	@Column(name = "dateHabilitation", nullable = true)
   private Date dateHabilitation;
   
	


public Long getId() {
	return id;
}



public void setId(Long id) {
	this.id = id;
}



public String getLoginUser() {
	return loginUser;
}



public void setLoginUser(String loginUser) {
	this.loginUser = loginUser;
}



public String getPwdUser() {
	return pwdUser;
}



public void setPwdUser(String pwdUser) {
	this.pwdUser = pwdUser;
}



public Date getDateHabilitation() {
	return dateHabilitation;
}



public void setDateHabilitation(Date dateHabilitation) {
	this.dateHabilitation = dateHabilitation;
}


//
//public Date getDateCreation() {
//	return dateCreation;
//}
//
//
//
//public void setDateCreation(Date dateCreation) {
//	this.dateCreation = dateCreation;
//}
//
//
//
//public Date getDateRadiation() {
//	return dateRadiation;
//}
//
//
//
//public void setDateRadiation(Date dateRadiation) {
//	this.dateRadiation = dateRadiation;
//}
//
//
//
//public Date getDateModification() {
//	return dateModification;
//}
//
//
//
//public void setDateModification(Date dateModification) {
//	this.dateModification = dateModification;
//}
//
//
//
//public Personne getPersonne() {
//	return personne;
//}
//
//
//
//public void setPersonne(Personne personne) {
//	this.personne = personne;
//}


//
//public List<Affectation> getAffectation() {
//	return affectation;
//}



//public void setAffectation(List<Affectation> affectation) {
//	this.affectation = affectation;
//}



	

   
	
}