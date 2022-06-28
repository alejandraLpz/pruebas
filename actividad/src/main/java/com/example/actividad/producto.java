package com.example.actividad;

import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "producto")

@Data
public class producto {
    @Id
    @Column(unique = true, nullable = false)
    String idpro;
    String nompro;
    String carpro;
    String prepro;
    
	public String getIdpro() {
		return idpro;
	}
	public void setIdpro(String idpro) {
		this.idpro = idpro;
	}
	public String getNompro() {
		return nompro;
	}
	public void setNompro(String nompro) {
		this.nompro = nompro;
	}
	public String getCarpro() {
		return carpro;
	}
	public void setCarpro(String carpro) {
		this.carpro = carpro;
	}
	public String getPrepro() {
		return prepro;
	}
	public void setPrepro(String prepro) {
		this.prepro = prepro;
	}
    
    
    
    
}
