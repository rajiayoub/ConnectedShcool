package com.connected.school.persistence.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "privilege")
public class Privilege   implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "libellePrivilege", nullable = true)
   private String libellePrivilege;

	@Column(name = "description", nullable = true)
	private String description;
	
	@Column(name = "dateCreation", nullable = true)
   private Date dateCreation;

	@Column(name = "dateRadiation", nullable = true)
   private Date dateRadiation;


	@Column(name = "dateModification", nullable = true)
   private Date dateModification;
   
 //  @OneToMany(mappedBy="privilege")
	// public Set<Assignation> Assignation;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getLibellePrivilege() {
	return libellePrivilege;
}

public void setLibellePrivilege(String libellePrivilege) {
	this.libellePrivilege = libellePrivilege;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public Date getDateCreation() {
	return dateCreation;
}

public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}

public Date getDateRadiation() {
	return dateRadiation;
}

public void setDateRadiation(Date dateRadiation) {
	this.dateRadiation = dateRadiation;
}

public Date getDateModification() {
	return dateModification;
}

public void setDateModification(Date dateModification) {
	this.dateModification = dateModification;
}

//public List<Assignation> getAssignation() {
//	return Assignation;
//}
//
//public void setAssignation(List<Assignation> assignation) {
//	Assignation = assignation;
//}

public static long getSerialversionuid() {
	return serialVersionUID;
}

   
   
}