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
public class Recepteur implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nomR;
	@Column
	private String  prenomR;
	@Column
	private String  telR;	
	@JsonIgnore
	@OneToMany(mappedBy="recepteur", fetch = FetchType.LAZY)
    private List<Envoie> envoies = new ArrayList<Envoie>();
	
	
	public Recepteur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNomR() {
		return nomR;
	}
	public void setNomR(String nomR) {
		this.nomR = nomR;
	}
	public String getPrenomR() {
		return prenomR;
	}
	public void setPrenomR(String prenomR) {
		this.prenomR = prenomR;
	}
	public String getTelR() {
		return telR;
	}
	public void setTelR(String telR) {
		this.telR = telR;
	}
	public void setEnvoies(List<Envoie> envoies) {
		this.envoies = envoies;
	}
	

}
