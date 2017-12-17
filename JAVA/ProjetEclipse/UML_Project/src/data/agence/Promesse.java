package data.agence;

import java.util.Date;

import data.immo.BienImmo;
import data.user.Client;

public class Promesse {
	
	private Double prixVerseVendeur;
	private Date vente;
	private Double commissionAgence;
	private Double fraisVente;
	private BienImmo bien;
	private Client acheteur;
	private Notaire notaire;
	private boolean etatFinit;
	
	public Promesse(Double prixVerseVendeurV, String adresseNotaireV, Date venteV, Double commissionAgenceV, Double fraisVenteV,
			BienImmo bienV, Client acheteurV, Notaire notaireV) {

		this.setPrixVerseVendeur(prixVerseVendeurV);
		this.setVente(venteV);
		this.setCommissionAgence(commissionAgenceV);
		this.setFraisVente(fraisVenteV);
		this.setBien(bienV);
		this.setAcheteur(acheteurV);
		this.setNotaire(notaireV);
		this.setEtatFinit(false);
		
	}
	
	public void signerPromesse() {
		
		notaire.verserArgent();
		
		this.setEtatFinit(true);
		
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

	/**
	 * @return the bien
	 */
	public BienImmo getBien() {
		return bien;
	}

	/**
	 * @param bien the bien to set
	 */
	public void setBien(BienImmo bien) {
		this.bien = bien;
	}

	/**
	 * @return the acheteur
	 */
	public Client getAcheteur() {
		return acheteur;
	}

	/**
	 * @param acheteur the acheteur to set
	 */
	public void setAcheteur(Client acheteur) {
		this.acheteur = acheteur;
	}

	/**
	 * @return the notaire
	 */
	public Notaire getNotaire() {
		return notaire;
	}

	/**
	 * @param notaire the notaire to set
	 */
	public void setNotaire(Notaire notaire) {
		this.notaire = notaire;
	}

	/**
	 * @return the etatFinit
	 */
	public boolean isEtatFinit() {
		return etatFinit;
	}

	/**
	 * @param etatFinit the etatFinit to set
	 */
	public void setEtatFinit(boolean etatFinit) {
		this.etatFinit = etatFinit;
	}

}
