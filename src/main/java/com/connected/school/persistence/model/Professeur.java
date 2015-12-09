package com.connected.school.persistence.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "professeur")
@PrimaryKeyJoinColumn(name="idPersonne")
public class Professeur extends Personne implements Serializable {

	
	private static final long serialVersionUID = 1L;
//	@Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "id", nullable = false)
//	private Long id;
	
	@Column(name = "matricule", nullable = true)
   private String matricule;

   @Column(name = "permanent", columnDefinition = "boolean default true")
   private boolean permanent;
   
	
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//	
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
   

   
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}