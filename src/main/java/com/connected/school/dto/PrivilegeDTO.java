package com.connected.school.dto;

import java.io.Serializable;
import java.sql.Date;

import org.hibernate.validator.constraints.NotEmpty;

public class PrivilegeDTO  extends AbstractDTO implements Serializable {

	
	
	private static final long serialVersionUID = 1L;
	 @NotEmpty
	private Long id;
	

   private String libellePrivilege;

	
	private String description;
	
	
   private Date dateCreation;

	
   private Date dateRadiation;


	
   private Date dateModification;


public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getLibellePrivilege() {
	return libellePrivilege;
}

public void setLibellePrivilege(String libellePrivilege) {
	this.libellePrivilege = libellePrivilege;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
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


   
   
}