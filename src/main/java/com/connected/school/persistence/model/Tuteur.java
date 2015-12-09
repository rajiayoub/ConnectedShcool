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

import java.util.*;


@Entity
@Table(name = "tuteur")
@PrimaryKeyJoinColumn(name="idPersonne")
public class Tuteur  extends Personne implements Serializable {

	
	private static final long serialVersionUID = 1L;
//	@Id
//  @GeneratedValue(strategy = GenerationType.AUTO)
//	private Long id;
//	
	
	@Column(name = "cin", nullable = true)
   private String cin;
   
	@Column(name = "profession", nullable = true)
   private String profession;

//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
   
	
	//public List<TypeLien> typeLien;


}