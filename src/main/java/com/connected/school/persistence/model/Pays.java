package com.connected.school.persistence.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "pays")
public class Pays  implements Serializable {

   private static final long serialVersionUID = 1L;


   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;
   

   @Column(name = "codePays", nullable = true)
   private String codePays;

   @Column(name = "nomPays", nullable = true)
   private String nomPays;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getCodePays() {
	return codePays;
}

public void setCodePays(String codePays) {
	this.codePays = codePays;
}

public String getNomPays() {
	return nomPays;
}

public void setNomPays(String nomPays) {
	this.nomPays = nomPays;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}
   

//   public Region[] region;
   
   


}