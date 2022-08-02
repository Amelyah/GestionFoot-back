package gestionFoot.model;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class Attaquant extends Joueur {
	
	private double tauxAssist;
	private double tauxBut;

	public Attaquant(String nom, String prenom, LocalDate naissance, double physique, double technique, double tactique,
			double mental, double tauxAssist, double tauxBut) {
		super(nom, prenom, naissance, physique, technique, tactique, mental);
		this.tauxAssist = tauxAssist;
		this.tauxBut = tauxBut;
	}
	public Attaquant() {
	}

	public double getTauxAssist() {
		return tauxAssist;
	}

	public void setTauxAssist(double tauxAssist) {
		this.tauxAssist = tauxAssist;
	}

	public double getTauxBut() {
		return tauxBut;
	}

	public void setTauxBut(double tauxBut) {
		this.tauxBut = tauxBut;
	}
	
	

}
