package gestionFoot.model;

import java.time.LocalDate;

public abstract class Personne {
	protected String nom;
	protected String prenom;
	protected LocalDate naissance;
	
	public Personne(String nom, String prenom, LocalDate naissance){
		this.nom = nom;
		this.prenom = prenom;
		this.naissance = naissance;
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getNaissance() {
		return naissance;
	}

	public void setNaissance(LocalDate naissance) {
		this.naissance = naissance;
	}

	
}
