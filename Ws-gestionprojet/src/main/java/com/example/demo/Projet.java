package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Projet {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idprojet;
	private String nom_projet;
	private String etatprojet;
	private int nbr_hrs;
	
	public Projet() {}

	public Projet(int idprojet, String nom_projet, String etatprojet, int nbr_hrs) {
		super();
		this.idprojet = idprojet;
		this.nom_projet = nom_projet;
		this.etatprojet = etatprojet;
		this.nbr_hrs = nbr_hrs;
	}

	public int getIdprojet() {
		return idprojet;
	}

	public void setIdprojet(int idprojet) {
		this.idprojet = idprojet;
	}

	public String getNom_projet() {
		return nom_projet;
	}

	public void setNom_projet(String nom_projet) {
		this.nom_projet = nom_projet;
	}

	public String getEtatprojet() {
		return etatprojet;
	}

	public void setEtatprojet(String etatprojet) {
		this.etatprojet = etatprojet;
	}

	public int getNbr_hrs() {
		return nbr_hrs;
	}

	public void setNbr_hrs(int nbr_hrs) {
		this.nbr_hrs = nbr_hrs;
	}

	
	
	
	

}
