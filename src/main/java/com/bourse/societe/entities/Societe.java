package com.bourse.societe.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Societe implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id;
	private String nomSociete;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the nomSociete
	 */
	public String getNomSociete() {
		return nomSociete;
	}
	/**
	 * @param nomSociete the nomSociete to set
	 */
	public void setNomSociete(String nomSociete) {
		this.nomSociete = nomSociete;
	}
	/**
	 * @param nomSociete
	 */
	public Societe(String nomSociete) {
		super();
		this.nomSociete = nomSociete;
	}
	/**
	 * 
	 */
	public Societe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
