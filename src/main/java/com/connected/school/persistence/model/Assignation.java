package com.connected.school.persistence.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name = "assignation")
public class Assignation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	@Column(name = "dateAssignation", nullable = true)
   private String dateAssignation;
	
   
//   @ManyToOne
//   public Privilege privilege;
//   
//   @ManyToOne
//   public Role role;


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getDateAssignation() {
	return dateAssignation;
}


public void setDateAssignation(String dateAssignation) {
	this.dateAssignation = dateAssignation;
}


//public Privilege getPrivilege() {
//	return privilege;
//}
//
//
//public void setPrivilege(Privilege privilege) {
//	this.privilege = privilege;
//}


public static long getSerialversionuid() {
	return serialVersionUID;
}
	
	
}