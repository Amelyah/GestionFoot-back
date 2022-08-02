package gestionFoot.model;
import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class Arbitre extends Personne {
	
	protected double impartialite;
	
	public Arbitre(String nom, String prenom, LocalDate naissance, double impartialite){
		
		super(nom,prenom,naissance);
		this.impartialite = impartialite;
		
	}
	public Arbitre() {}
	
	public double getImpartialite() {
		return impartialite;
	}

	public void setImpartialite(double impartialite) {
		this.impartialite = impartialite;
	}

	@Override
	public String toString() {
		return "Arbitre [impartialite=" + impartialite + "]";
	}

}
