package gestionFoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;


public class Match {
	

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne
	private Arbitre arbitre;
	
	@OneToOne
	private Equipe equipe1;
	
	@OneToOne
	private Equipe equipe2;
	
	@OneToOne
	private Stade stade;
	
	@OneToOne
	private Score scoreDom;
	
	@OneToOne
	private Score scoreExt;
	
	private boolean fini = false;
	//private Localisation loalisation;
	
	
	public Match(Arbitre arbitre, Equipe equipe1, Equipe equipe2, Stade stade) {
		super();
		this.arbitre = arbitre;
		this.equipe1 = equipe1;
		this.equipe2 = equipe2;
		this.stade = stade;
	}
	public Match() {}
	
	public Arbitre getArbitre() {
		return arbitre;
	}
	
	public void setArbitre(Arbitre arbitre) {
		this.arbitre = arbitre;
	}
	
	public Equipe getEquipe1() {
		return equipe1;
	}
	
	public void setEquipe1(Equipe equipe1) {
		this.equipe1 = equipe1;
	}
	
	public Equipe getEquipe2() {
		return equipe2;
	}
	
	public void setEquipe2(Equipe equipe2) {
		this.equipe2 = equipe2;
	}
	
	public Stade getStade() {
		return stade;
	}
	
	public void setStade(Stade stade) {
		this.stade = stade;
	}
	
	public Score getScoreDom() {
		return scoreDom;
	}
	
	public void setScoreDom(Score scoreDom) {
		this.scoreDom = scoreDom;
	}
	
	public Score getScoreExt() {
		return scoreExt;
	}
	
	public void setScoreExt(Score scoreExt) {
		this.scoreExt = scoreExt;
	}
	
	public boolean isFini() {
		return fini;
	}
	
	public void setFini(boolean fini) {
		this.fini = fini;
	}
	
	
	public void revisionStatsEquipe(Equipe e ) {
		
		
		
		
	}

}
