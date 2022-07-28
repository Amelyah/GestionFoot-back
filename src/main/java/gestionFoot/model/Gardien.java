package gestionFoot.model;
import java.time.LocalDate;


public class Gardien extends Joueur{
	
	protected double tauxArret;
	protected double tauxJeuPied;
	
	public Gardien(String nom, String prenom, LocalDate naissance, double physique, double technique, double tactique, double mental, double tauxArret, double tauxJeuPied ){
		super(nom, prenom,  naissance, physique,  technique,  tactique,  mental);
		this.tauxArret = tauxArret;
		this.tauxJeuPied = tauxJeuPied;
		
	}

	public double getNbArret() {
		return tauxArret;
	}

	public void setNbArret(int nbArret) {
		this.tauxArret = nbArret;
	}

	public double getJeuPied() {
		return tauxArret;
	}

	public void setJeuPied(int jeuPied) {
		this.tauxArret = jeuPied;
	}
	
	

}