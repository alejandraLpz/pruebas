package com.example.actividad;

import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "categoria")

@Data
public class categoria {
	@Id
    @Column(unique = true, nullable = false)
    String idcat;
    String nomcat;
    String detcat;
	public String getIdcat() {
		return idcat;
	}
	public void setIdcat(String idcat) {
		this.idcat = idcat;
	}
	public String getNomcat() {
		return nomcat;
	}
	public void setNomcat(String nomcat) {
		this.nomcat = nomcat;
	}
	public String getDetcat() {
		return detcat;
	}
	public void setDetcat(String detcat) {
		this.detcat = detcat;
	}
    
    
}
