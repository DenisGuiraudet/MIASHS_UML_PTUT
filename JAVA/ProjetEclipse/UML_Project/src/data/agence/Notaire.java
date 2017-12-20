package data.agence;

import java.io.Serializable;

public class Notaire implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nom;
	private String adresse;
	
	public Notaire(String nomV, String adresseV) {

		this.setNom(nomV);
		this.setAdresse(adresseV);
		
	}
	
	public void verserArgent() {

		// TODO
		
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the adresseNotaire
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresseNotaire the adresseNotaire to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	@Override
	public String toString() {
		return ("\n+ Notaire : " + "\n- Nom : " + getNom() + "\n- Adresse : " + getAdresse());
	}

}
