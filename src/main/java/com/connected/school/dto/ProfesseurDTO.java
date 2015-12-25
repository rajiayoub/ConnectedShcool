package com.connected.school.dto;

import java.io.Serializable;




public class ProfesseurDTO extends AbstractDTO implements Serializable  {

	
	private static final long serialVersionUID = 1L;


	private Long id;
	

   private String matricule;
   
   private String firstName; 


   private boolean permanent;
   
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
   public String getMatricule() {
      return matricule;
   }
   
   public void setMatricule(String newMatricule) {
      matricule = newMatricule;
   }
   
   public boolean getPermanent() {
	  
      return permanent;
   }
   
   public void setPermanent(boolean newPermanent) {
     
	   permanent = newPermanent;
   }


public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getFirstName() {
	return firstName;
}




}