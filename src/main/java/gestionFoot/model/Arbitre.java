package gestionFoot.model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Entity
public class Arbitre extends Personne {
	
	private double impartialite;
	
	@OneToMany(mappedBy="arbitre")
	private List<Match> listeMatchArbitres;
	
	 
	
	
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
		return "Arbitre [impartialite=" + impartialite + ", listeMatchArbitres=" + listeMatchArbitres + ", id=" + id
				+ ", nom=" + nom + ", prenom=" + prenom + ", naissance=" + naissance + "]";
	}

	
}
