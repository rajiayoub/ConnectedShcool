package com.connected.school.persistence.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;



import java.util.*;


@Entity
@Table(name = "affectation")
public class Affectation implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = true)
	private Long id;

	@Column(name = "dateAffectation", nullable = true)
    private Date dateAffectation;
    
//	@ManyToOne
//   public Role role;
//    
//	@ManyToOne
//   public Profil profil;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateAffectation() {
		return dateAffectation;
	}

	public void setDateAffectation(Date dateAffectation) {
		this.dateAffectation = dateAffectation;
	}

//	public Role getRole() {
//		return role;
//	}
//
//	public void setRole(Role role) {
//		this.role = role;
//	}
//
//	public Profil getProfil() {
//		return profil;
//	}
//
//	public void setProfil(Profil profil) {
//		this.profil = profil;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
   


}