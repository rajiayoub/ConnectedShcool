package com.connected.school.dto;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import java.util.*;



public class ProfilDTO  extends AbstractDTO implements Serializable {
   
	
	
	
   private String loginUser;
   
   private String pwdUser;
   
   private Date dateHabilitation;

public String getLoginUser() {
	return loginUser;
}

public void setLoginUser(String loginUser) {
	this.loginUser = loginUser;
}

public String getPwdUser() {
	return pwdUser;
}

public void setPwdUser(String pwdUser) {
	this.pwdUser = pwdUser;
}

public Date getDateHabilitation() {
	return dateHabilitation;
}

public void setDateHabilitation(Date dateHabilitation) {
	this.dateHabilitation = dateHabilitation;
}
   
	




	

   
	
}