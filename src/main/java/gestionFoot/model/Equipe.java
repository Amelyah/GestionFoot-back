package gestionFoot.model;

import java.util.HashMap;
import java.util.List;

public class Equipe {
	
	private String pays ;
	private String couleur ;
	private int classement;
	private List<Joueur> listJoueur ;
	private Entraineur entraineur;
	private HashMap<Match,Score> historique;
	private double cohesion;
	private double jeux;
	private double pressing;
	
	
	
	
	public Equipe(String pays, String couleur, int classement, List<Joueur> listJoueur,
			Entraineur entraineur) {
		super();
		this.pays = pays;
		this.couleur = couleur;
		this.classement = classement;
		this.listJoueur = listJoueur;
		this.entraineur = entraineur;
	}


	public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}


	public String getCouleur() {
		return couleur;
	}


	public void setCouleur(String couleur) {
		this.couleur = couleur;
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


	public HashMap<Match, Score> getHistorique() {
		return historique;
	}


	public void setHistorique(HashMap<Match, Score> historique) {
		this.historique = historique;
	}
	
	

}
