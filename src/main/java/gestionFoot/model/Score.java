package gestionFoot.model;

public class Score {
	
	private int scoreDom;
	private int scoreExt;
	
	
	public Score(int scoreDom, int scoreExt) {
		super();
		this.scoreDom = scoreDom;
		this.scoreExt = scoreExt;
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
	
	
}
