package com.connected.school.persistence.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "region")
public class Region  implements Serializable {

  private static final long serialVersionUID = 1L;

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;
   


   @Column(name = "codeRegion", nullable = true)
   private String codeRegion;


   @Column(name = "nomRegion", nullable = true)
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


public static long getSerialversionuid() {
	return serialVersionUID;
}
   

  
  // public Pays pays;

//   public Ville[] ville;
   
   


}