package lambdas;

public class Personne {

	private String nom;
	private double solde;
	
	Personne(double solde) {
		this.solde = solde;
	}
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}

}
