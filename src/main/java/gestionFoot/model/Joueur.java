package gestionFoot.model;
import java.time.LocalDate;

public abstract class Joueur extends Personne {
	
	protected double physique;
	protected double technique;
	protected double tactique;
	protected double mental;
	
	public Joueur(String nom, String prenom, LocalDate naissance, double physique, double technique, double tactique, double mental){
		super(nom, prenom, naissance);
		this.physique = physique ;
		this.technique = technique;
		this.tactique = tactique;
		this.mental = mental;
	}

	public double getPhysique() {
		return physique;
	}

	public void setPhysique(double physique) {
		this.physique = physique;
	}

	public double getTechnique() {
		return technique;
	}

	public void setTechnique(double technique) {
		this.technique = technique;
	}

	public double getTactique() {
		return tactique;
	}

	public void setTactique(double tactique) {
		this.tactique = tactique;
	}

	public double getMental() {
		return mental;
	}

	public void setMental(double mental) {
		this.mental = mental;
	}
	
	

}
