package com.connected.school.dto;

import java.io.Serializable;



public class RegionDTO   extends AbstractDTO implements Serializable {

  private static final long serialVersionUID = 1L;


   private Long id;
   



   private String codeRegion;



   private String nomRegion;


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getCodeRegion() {
	return codeRegion;
}


public void setCodeRegion(String codeRegion) {
	this.codeRegion = codeRegion;
}


public String getNomRegion() {
	return nomRegion;
}


public void setNomRegion(String nomRegion) {
	this.nomRegion = nomRegion;
}


   

  
  // public Pays pays;

//   public Ville[] ville;
   
   


}