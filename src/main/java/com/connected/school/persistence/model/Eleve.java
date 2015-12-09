package com.connected.school.persistence.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;


@Entity
@Table(name = "eleve")
@PrimaryKeyJoinColumn(name="idPersonne")
public class Eleve  extends Personne implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "id", nullable = true)
//	private Long id;	

	
	@Column(name = "codeEleve", nullable = true)
	private String codeEleve;
	
	

	@Column(name = "codeNationalEtudiant", nullable = true)
   private String codeNationalEtudiant;
	
   
//   @OneToMany(mappedBy="eleve")
//	public List<TypeLien> typeLien;


//public Long getId() {
//	return id;
//}
//
//
//public void setId(Long id) {
//	this.id = id;
//}


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


//public List<TypeLien> getTypeLien() {
//	return typeLien;
//}
//
//
//public void setTypeLien(List<TypeLien> typeLien) {
//	this.typeLien = typeLien;
//}


public static long getSerialversionuid() {
	return serialVersionUID;
}
	
   



}