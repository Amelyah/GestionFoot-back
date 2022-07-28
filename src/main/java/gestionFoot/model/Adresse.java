package gestionFoot.model;

public class Adresse {
	private String numVoie;
	private String nomVoie;
	private String cp;
	private String ville;

	
	public Adresse(String numVoie, String nomVoie, String cp, String ville) {
		super();
		this.numVoie = numVoie;
		this.nomVoie = nomVoie;
		this.cp = cp;
		this.ville = ville;
	}
	
	
	public String getNumVoie() {
		return numVoie;
	}
	
	
	public void setNumVoie(String numVoie) {
		this.numVoie = numVoie;
	}
	
	
	public String getNomVoie() {
		return nomVoie;
	}
	
	
	public void setNomVoie(String nomVoie) {
		this.nomVoie = nomVoie;
	}
	
	
	public String getCp() {
		return cp;
	}
	
	
	public void setCp(String cp) {
		this.cp = cp;
	}
	
	
	public String getVille() {
		return ville;
	}
	
	
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
	@Override
	public String toString() {
		return "Adresse [numVoie=" + numVoie + ", nomVoie=" + nomVoie + ", cp=" + cp + ", ville=" + ville + "]";
	}
	
	
}
