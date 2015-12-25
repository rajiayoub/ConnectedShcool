package com.connected.school.dto;

import java.io.Serializable;





 
public class VilleDTO  implements Serializable {

   private static final long serialVersionUID = 1L;


   private Long id;
   


   
   private String codeVille;

   
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


   

  
  // public Region region;
   
   
   //public Adresse adresse;
   
   
}