package gestionFoot.model;

public class Stade {
	private String nom;
	private String capacite;
	private String adresse;
	private double ambiance;
	
	

	public Stade(String nom, String capacite, String adresse, double ambiance) {
		super();
		this.nom = nom;
		this.capacite = capacite;
		this.adresse = adresse;
		this.ambiance = ambiance;
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

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public double getAmbiance() {
		return ambiance;
	}

	public void setAmbiance(double ambiance) {
		this.ambiance = ambiance;
	}
	
	
}
