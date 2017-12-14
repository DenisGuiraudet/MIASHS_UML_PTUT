package data.agence;

import java.util.Date;

public class Promesse {
	
	private Double prixVerseVendeur;
	private String adresseNotaire;
	private Date vente;
	private Double commissionAgence;
	private Double fraisVente;
	
	public Promesse(Double prixVerseVendeurV, String adresseNotaireV, Date venteV, Double commissionAgenceV, Double fraisVenteV) {

		this.setPrixVerseVendeur(prixVerseVendeurV);
		this.setAdresseNotaire(adresseNotaireV);
		this.setVente(venteV);
		this.setCommissionAgence(commissionAgenceV);
		this.setFraisVente(fraisVenteV);
		
	}
	
	public void signerPromesse() {
		
		
		
	}

	/**
	 * @return the prixVerseVendeur
	 */
	public Double getPrixVerseVendeur() {
		return prixVerseVendeur;
	}

	/**
	 * @param prixVerseVendeur the prixVerseVendeur to set
	 */
	public void setPrixVerseVendeur(Double prixVerseVendeur) {
		this.prixVerseVendeur = prixVerseVendeur;
	}

	/**
	 * @return the adresseNotaire
	 */
	public String getAdresseNotaire() {
		return adresseNotaire;
	}

	/**
	 * @param adresseNotaire the adresseNotaire to set
	 */
	public void setAdresseNotaire(String adresseNotaire) {
		this.adresseNotaire = adresseNotaire;
	}

	/**
	 * @return the vente
	 */
	public Date getVente() {
		return vente;
	}

	/**
	 * @param vente the vente to set
	 */
	public void setVente(Date vente) {
		this.vente = vente;
	}

	/**
	 * @return the commissionAgence
	 */
	public Double getCommissionAgence() {
		return commissionAgence;
	}

	/**
	 * @param commissionAgence the commissionAgence to set
	 */
	public void setCommissionAgence(Double commissionAgence) {
		this.commissionAgence = commissionAgence;
	}

	/**
	 * @return the fraisVente
	 */
	public Double getFraisVente() {
		return fraisVente;
	}

	/**
	 * @param fraisVente the fraisVente to set
	 */
	public void setFraisVente(Double fraisVente) {
		this.fraisVente = fraisVente;
	}

}
