package com.connected.school.dto;

import java.io.Serializable;








public class TuteurDTO  extends AbstractDTO implements Serializable {

	
	private static final long serialVersionUID = 1L;


	
	

   private String cin;
   

   private String profession;



	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}


	//public List<TypeLien> typeLien;


}