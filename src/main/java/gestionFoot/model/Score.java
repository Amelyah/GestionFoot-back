package gestionFoot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Score {
	
	
	
	@Id
	@Column(length = 10, nullable = false, unique = false)
	private int scoreDom;
	
	@Column(length = 10, nullable = false, unique = false)
	private int scoreExt;
	
	
	public Score(int scoreDom, int scoreExt) {
		super();
		this.scoreDom = scoreDom;
		this.scoreExt = scoreExt;
	}
	
	public Score() {}
	
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

	@Override
	public String toString() {
		return "Score [scoreDom=" + scoreDom + ", scoreExt=" + scoreExt + "]";
	}

}
