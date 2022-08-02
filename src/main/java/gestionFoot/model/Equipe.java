package gestionFoot.model;

import java.util.HashMap;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Equipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Enumerated(EnumType.STRING)
	private Pays pays ;
	
	private int classement;

	@OneToMany
	private List<Joueur> listJoueur ;
	
	@OneToOne
	private Entraineur entraineur;
	
	private String couleur;
	
	private transient HashMap<Match,Score> historique;
	
	private double cohesion;
	private double jeux;
	private double pressing;
	
	
	public Equipe() {}
	
	public Equipe(Pays pays, String couleur, int classement, List<Joueur> listJoueur,
			Entraineur entraineur) {
		super();
		this.pays = pays;
		this.couleur = couleur;
		this.classement = classement;
		this.listJoueur = listJoueur;
		this.entraineur = entraineur;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}

	public int getClassement() {
		return classement;
	}

	public void setClassement(int classement) {
		this.classement = classement;
	}

	public List<Joueur> getListJoueur() {
		return listJoueur;
	}

	public void setListJoueur(List<Joueur> listJoueur) {
		this.listJoueur = listJoueur;
	}

	public Entraineur getEntraineur() {
		return entraineur;
	}

	public void setEntraineur(Entraineur entraineur) {
		this.entraineur = entraineur;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public HashMap<Match, Score> getHistorique() {
		return historique;
	}

	public void setHistorique(HashMap<Match, Score> historique) {
		this.historique = historique;
	}

	public double getCohesion() {
		return cohesion;
	}

	public void setCohesion(double cohesion) {
		this.cohesion = cohesion;
	}

	public double getJeux() {
		return jeux;
	}

	public void setJeux(double jeux) {
		this.jeux = jeux;
	}

	public double getPressing() {
		return pressing;
	}

	public void setPressing(double pressing) {
		this.pressing = pressing;
	}


	

}
