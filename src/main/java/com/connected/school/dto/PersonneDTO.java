package com.connected.school.dto;

import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

import com.connected.ui.tags.utils.annotations.FormField;
import com.connected.ui.tags.utils.annotations.FormWidgetType;

public class PersonneDTO {

	private Long id;

    
    @FormField(label = "First Name", order = 1)
	private String firstname;
	
   
    @FormField(label = "Last Name", order = 2)
	private String lastname;

    @FormField(label = "Is Admin", type = FormWidgetType.CHECKBOX, order = 3)    
    boolean admin;
    
    List<String> roles;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	
}
