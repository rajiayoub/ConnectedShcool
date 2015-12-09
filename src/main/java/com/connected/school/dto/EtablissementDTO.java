package com.connected.school.dto;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

public class EtablissementDTO  extends AbstractDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
    @NotEmpty
	private String name;
    @NotEmpty
	private String adresse;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
