package gestionFoot.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity

@Inheritance(strategy = InheritanceType.SINGLE_TABLE )
public abstract class Personne {
	@Id
	protected String nom;
	protected String prenom;
	protected LocalDate naissance;
		
	public Personne(String nom, String prenom, LocalDate naissance){
		this.nom = nom;
		this.prenom = prenom;
		this.naissance = naissance;
		
	}	
	
	public Personne(){	}

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
