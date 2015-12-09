package com.connected.school.dto;

import java.io.Serializable;
import java.sql.Date;

import org.hibernate.validator.constraints.NotEmpty;

public class PrivilegeDTO  extends AbstractDTO implements Serializable {

	
	
	private static final long serialVersionUID = 1L;
	
	

   private String libellePrivilege;

	
	private String description;
	




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



   
   
}