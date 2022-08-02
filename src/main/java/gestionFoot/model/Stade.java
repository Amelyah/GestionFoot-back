package gestionFoot.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("Stade")
public class Stade {
	
	@Id
	@Column(length = 100, nullable = false, unique = false)
	private String nom;
	
	
	@Column(length = 6, nullable = false, unique = false)
	private String capacite;
	
	@Embedded // erreur a partir de la classe addresse.
	private Adresse adresse;
	
	@Column(length = 10, nullable = false, unique = false)
	private double ambiance;
	
	

	public Stade(String nom, String capacite, Adresse adresse, double ambiance) {
		this.nom = nom;
		this.capacite = capacite;
		this.adresse = adresse;
		this.ambiance = ambiance;
	}
	
	public Stade() {	
	}

	
	

	public String getCapacite() {
		return capacite;
	}

	public void setCapacite(String capacite) {
		this.capacite = capacite;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCapacité() {
		return capacite;
	}

	public void setCapacité(String capacité) {
		this.capacite = capacité;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	
	public double getAmbiance() {
		return ambiance;
	}

	public void setAmbiance(double ambiance) {
		this.ambiance = ambiance;
	}
	
	

	
	
}
