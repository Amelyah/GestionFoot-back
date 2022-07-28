package gestionFoot.model;

import java.time.LocalDate;

public class Milieu extends Joueur {
	
	private double tauxEspace;
	private double tauxTransmissionAttaquant;

	public Milieu(String nom, String prenom, LocalDate naissance, double physique, double technique, double tactique,
			double mental, double tauxEspace, double tauxTransmissionAttaquant) {
		super(nom, prenom, naissance, physique, technique, tactique, mental);
		this.tauxEspace = tauxEspace;
		this.tauxTransmissionAttaquant = tauxTransmissionAttaquant;
	}

	public double getTauxEspace() {
		return tauxEspace;
	}

	public void setTauxEspace(double tauxEspace) {
		this.tauxEspace = tauxEspace;
	}

	public double getTauxTransmissionAttaquant() {
		return tauxTransmissionAttaquant;
	}

	public void setTauxTransmissionAttaquant(double tauxTransmissionAttaquant) {
		this.tauxTransmissionAttaquant = tauxTransmissionAttaquant;
	}
	
	

}


