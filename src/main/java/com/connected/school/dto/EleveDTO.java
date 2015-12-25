package com.connected.school.dto;

import java.io.Serializable;






public class EleveDTO   extends AbstractDTO implements Serializable{

	static final long serialVersionUID = 1L;





	

	private String codeEleve;
	
	


   private String codeNationalEtudiant;

   
   public String getCodeEleve() {
	return codeEleve;
}


public void setCodeEleve(String codeEleve) {
	this.codeEleve = codeEleve;
}


public String getCodeNationalEtudiant() {
	return codeNationalEtudiant;
}


public void setCodeNationalEtudiant(String codeNationalEtudiant) {
	this.codeNationalEtudiant = codeNationalEtudiant;
}


   



}