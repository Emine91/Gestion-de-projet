package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int iduser;
	private String nomuser;
	private String pwuser;
	private String role;

	public User() {}

	public User(int iduser, String nomuser, String pwuser, String role) {
		super();
		this.iduser = iduser;
		this.nomuser = nomuser;
		this.pwuser = pwuser;
		this.role = role;
	}

	public int getIduser() {
		return iduser;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	public String getNomuser() {
		return nomuser;
	}

	public void setNomuser(String nomuser) {
		this.nomuser = nomuser;
	}

	public String getPwuser() {
		return pwuser;
	}

	public void setPwuser(String pwuser) {
		this.pwuser = pwuser;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	

	
	
	

	
	
	
}
