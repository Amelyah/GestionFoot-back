package gestionFoot.model;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Entraineur extends Personne {
	
	private double pedagogie;
	private double experience;
	private double ecoute;
	private double maitriseTechnique;
	private double maitriseTactique;
	
	@OneToOne
	private Equipe equipe;
	
	
	public Entraineur(String nom, String prenom, LocalDate naissance, double pedagogie, double experience,
			double ecoute, double maitriseTechnique, double maitriseTactique) {
		super(nom, prenom, naissance);
		this.pedagogie = pedagogie;
		this.experience = experience;
		this.ecoute = ecoute;
		this.maitriseTechnique = maitriseTechnique;
		this.maitriseTactique = maitriseTactique;
	}

	public Entraineur() {}
	
	public double getPedagogie() {
		return pedagogie;
	}

	public void setPedagogie(double pedagogie) {
		this.pedagogie = pedagogie;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public double getEcoute() {
		return ecoute;
	}

	public void setEcoute(double ecoute) {
		this.ecoute = ecoute;
	}

	public double getMaitriseTechnique() {
		return maitriseTechnique;
	}

	public void setMaitriseTechnique(double maitriseTechnique) {
		this.maitriseTechnique = maitriseTechnique;
	}

	public double getMaitriseTactique() {
		return maitriseTactique;
	}

	public void setMaitriseTactique(double maitriseTactique) {
		this.maitriseTactique = maitriseTactique;
	}

	@Override
	public String toString() {
		return "Entraineur [nom=" + nom + ", prenom=" + prenom + ", naissance=" + naissance + ", pedagogie=" + pedagogie
				+ ", experience=" + experience + ", ecoute=" + ecoute + ", maitriseTechnique=" + maitriseTechnique
				+ ", maitriseTactique=" + maitriseTactique + ", equipe=" + equipe + "]";
	}

	public void coachingEquipe(Equipe e, int pedagogie, int ecoute, int maitriseTechnique, int maitriseTactique) {
		
	}

}
