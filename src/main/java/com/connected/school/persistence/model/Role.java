package com.connected.school.persistence.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name = "role")
public class Role  implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;
	
	
	@Column(name = "libelleRole", nullable = true)
   private String libelleRole;

	
//   
//   @OneToMany(mappedBy="role")
//	public List<Assignation> Assignation;
//   
//
//
//   @OneToMany(mappedBy="role")
//   public List<Affectation> affectation;



public Long getId() {
	return id;
}



public void setId(Long id) {
	this.id = id;
}



public String getLibelleRole() {
	return libelleRole;
}



public void setLibelleRole(String libelleRole) {
	this.libelleRole = libelleRole;
}

//
//public List<Assignation> getAssignation() {
//	return Assignation;
//}
//
//
//
//public void setAssignation(List<Assignation> assignation) {
//	Assignation = assignation;
//}
//
//
//
//public List<Affectation> getAffectation() {
//	return affectation;
//}
//
//
//
//public void setAffectation(List<Affectation> affectation) {
//	this.affectation = affectation;
//}



public static long getSerialversionuid() {
	return serialVersionUID;
}
	
   
   


}