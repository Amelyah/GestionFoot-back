package gestionFoot.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="type_personne")
public abstract class Personne {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	protected Integer id;
	
	@Column(columnDefinition = "VARCHAR(25)", nullable=false)
	protected String nom;
	
	@Column(columnDefinition = "VARCHAR(25)",nullable=false)
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

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", naissance=" + naissance + "]";
	}

	
	
}
