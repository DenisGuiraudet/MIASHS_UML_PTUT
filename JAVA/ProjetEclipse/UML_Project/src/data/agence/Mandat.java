package data.agence;

import java.util.Date;
import java.util.HashMap;

import data.immo.BienImmo;
import data.user.Client;

public class Mandat {
	
	private Double prix;
	private Date vente;
	private Date debut;
	private Date fin;
	private HashMap<Date, Client> listeRdvVisite;
	private BienImmo bien;
	private Client vendeur;
	
	public Mandat(Double prixV, Date venteV, Date debutV, Date finV,
			BienImmo bienV, Client vendeurV) {

		this.setPrix(prixV);
		this.setVente(venteV);
		this.setDebut(debutV);
		this.setFin(finV);
		this.listeRdvVisite = new HashMap<Date, Client>();
		this.setBien(bienV);
		this.setVendeur(vendeurV);
		
	}

	/**
	 * @return the prix
	 */
	public Double getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(Double prix) {
		this.prix = prix;
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
	 * @return the debut
	 */
	public Date getDebut() {
		return debut;
	}

	/**
	 * @param debut the debut to set
	 */
	public void setDebut(Date debut) {
		this.debut = debut;
	}

	/**
	 * @return the fin
	 */
	public Date getFin() {
		return fin;
	}

	/**
	 * @param fin the fin to set
	 */
	public void setFin(Date fin) {
		this.fin = fin;
	}
	
	public void addRdvVisite(Date date, Client client) {
		
		listeRdvVisite.put(date, client);
		
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
	 * @return the vendeur
	 */
	public Client getVendeur() {
		return vendeur;
	}

	/**
	 * @param vendeur the vendeur to set
	 */
	public void setVendeur(Client vendeur) {
		this.vendeur = vendeur;
	}

}
