package com.connected.school.dto;

import java.io.Serializable;
import java.sql.Date;



public class AffectationDTO  extends AbstractDTO implements Serializable {




	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;




	
	private Long id;

	
    private Date dateAffectation;
    


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
   


}