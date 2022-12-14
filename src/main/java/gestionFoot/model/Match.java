package gestionFoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import gestionFoot.jsonviews.JsonViews;

@Entity
@Table(name="rencontre")
public class Match {
	
	@JsonView(JsonViews.Base.class)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@JsonView(JsonViews.MatchWithArbitre.class)
	@ManyToOne
	private Arbitre arbitre;
	
	@ManyToOne
	private Equipe equipeDom;
	
	@ManyToOne
	private Equipe equipeExt;
	
	@ManyToOne
	private Stade stade;
	
	@JsonView(JsonViews.Base.class)
	private int scoreDom;

	@JsonView(JsonViews.Base.class)
	private int scoreExt;
	
	@JsonView(JsonViews.Base.class)
	private boolean fini = false;
	
	
	public Match(Arbitre arbitre, Equipe equipeDom, Equipe equipeExt, Stade stade) {

		this.arbitre = arbitre;
		this.equipeDom = equipeDom;
		this.equipeExt = equipeExt;
		this.stade = stade;
	}
	public Match() {}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Arbitre getArbitre() {
		return arbitre;
	}
	public void setArbitre(Arbitre arbitre) {
		this.arbitre = arbitre;
	}
	public Equipe getEquipeDom() {
		return equipeDom;
	}
	public void setEquipeDom(Equipe equipeDom) {
		this.equipeDom = equipeDom;
	}
	public Equipe getEquipeExt() {
		return equipeExt;
	}
	public void setEquipeExt(Equipe equipeExt) {
		this.equipeExt = equipeExt;
	}
	public Stade getStade() {
		return stade;
	}
	public void setStade(Stade stade) {
		this.stade = stade;
	}
	public int getScoreDom() {
		return scoreDom;
	}
	public void setScoreDom(int scoreDom) {
		this.scoreDom = scoreDom;
	}
	public int getScoreExt() {
		return scoreExt;
	}
	public void setScoreExt(int scoreExt) {
		this.scoreExt = scoreExt;
	}
	public boolean isFini() {
		return fini;
	}
	public void setFini(boolean fini) {
		this.fini = fini;
	}
	public void revisionStatsEquipe(Equipe e ) {}
	
	@Override
	public String toString() {
		return "Match [id=" + id + ", arbitre=" + arbitre + ", equipeDom=" + equipeDom + ", equipeExt=" + equipeExt
				+ ", stade=" + stade + ", scoreDom=" + scoreDom + ", scoreExt=" + scoreExt + ", fini=" + fini + "]";
	}
		
		
		

}
