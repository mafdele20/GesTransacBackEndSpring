package com.spring.angular.AngularTransfert.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Emetteur implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nomE;
	@Column
	private String  prenomE;
	@Column
	private String  telE;
	@Column
	private String cinE;
	@JsonIgnore
	@OneToMany(mappedBy="emetteur" ,fetch = FetchType.LAZY)
    private List<Envoie> envoies = new ArrayList<Envoie>();
	public Emetteur() {
		
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getNomE() {
		return nomE;
	}
	public void setNomE(String nomE) {
		this.nomE = nomE;
	}
	public String getPrenomE() {
		return prenomE;
	}
	public void setPrenomE(String prenomE) {
		this.prenomE = prenomE;
	}
	public String getTelE() {
		return telE;
	}
	public void setTelE(String telE) {
		this.telE = telE;
	}
	public String getCinE() {
		return cinE;
	}
	public void setCinE(String cinE) {
		this.cinE = cinE;
	}
	public List<Envoie> getEnvoies() {
		return envoies;
	}
	public void setEnvoies(List<Envoie> envoies) {
		this.envoies = envoies;
	}
	
	
}
