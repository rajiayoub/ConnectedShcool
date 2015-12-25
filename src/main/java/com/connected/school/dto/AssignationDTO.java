package com.connected.school.dto;

import java.io.Serializable;


public class AssignationDTO extends AbstractDTO implements Serializable {



	private static final long serialVersionUID = 1L;


	private Long id;
	
	

   private String dateAssignation;
	
   


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getDateAssignation() {
	return dateAssignation;
}


public void setDateAssignation(String dateAssignation) {
	this.dateAssignation = dateAssignation;
}




	
	
}