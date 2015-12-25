package com.connected.school.dto;
import java.io.Serializable;

public class PaysDTO  extends AbstractDTO implements Serializable {

   private static final long serialVersionUID = 1L;


   private Long id;
   


   private String codePays;


   private String nomPays;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getCodePays() {
	return codePays;
}

public void setCodePays(String codePays) {
	this.codePays = codePays;
}

public String getNomPays() {
	return nomPays;
}

public void setNomPays(String nomPays) {
	this.nomPays = nomPays;
}

   

//   public Region[] region;
   
   


}