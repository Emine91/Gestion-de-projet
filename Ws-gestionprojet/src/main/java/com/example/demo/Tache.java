package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Tache {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int idtache;
private int idprojet;
private int iduser;
private String nom_tache;
private String desciption_tache;
private String deb_tache;
private String fin_tache;
private String nbr_hrs_tache;
private String etattache;




public Tache() {}




public Tache(int idtache, int idprojet, int iduser, String nom_tache, String desciption_tache, String deb_tache,
		String fin_tache, String nbr_hrs_tache, String etattache) {
	super();
	this.idtache = idtache;
	this.idprojet = idprojet;
	this.iduser = iduser;
	this.nom_tache = nom_tache;
	this.desciption_tache = desciption_tache;
	this.deb_tache = deb_tache;
	this.fin_tache = fin_tache;
	this.nbr_hrs_tache = nbr_hrs_tache;
	this.etattache = etattache;
}




public int getIdtache() {
	return idtache;
}




public void setIdtache(int idtache) {
	this.idtache = idtache;
}




public int getIdprojet() {
	return idprojet;
}




public void setIdprojet(int idprojet) {
	this.idprojet = idprojet;
}




public int getIduser() {
	return iduser;
}




public void setIduser(int iduser) {
	this.iduser = iduser;
}




public String getNom_tache() {
	return nom_tache;
}




public void setNom_tache(String nom_tache) {
	this.nom_tache = nom_tache;
}




public String getDesciption_tache() {
	return desciption_tache;
}




public void setDesciption_tache(String desciption_tache) {
	this.desciption_tache = desciption_tache;
}




public String getDeb_tache() {
	return deb_tache;
}




public void setDeb_tache(String deb_tache) {
	this.deb_tache = deb_tache;
}




public String getFin_tache() {
	return fin_tache;
}




public void setFin_tache(String fin_tache) {
	this.fin_tache = fin_tache;
}




public String getNbr_hrs_tache() {
	return nbr_hrs_tache;
}




public void setNbr_hrs_tache(String nbr_hrs_tache) {
	this.nbr_hrs_tache = nbr_hrs_tache;
}




public String getEtattache() {
	return etattache;
}




public void setEtattache(String etattache) {
	this.etattache = etattache;
}










}
