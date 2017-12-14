package data.agence;

import java.util.Date;
import java.util.HashMap;

import data.user.Client;

public class Mandat {
	
	private HashMap<Date, Client> listeRdvVisite;
	private int prix;
	private Date vente;
	private Date debut;
	private Date fin;
	
	public Mandat(int prixV, Date venteV, Date debutV, Date finV) {

		this.listeRdvVisite = new HashMap<Date, Client>();
		this.setPrix(prixV);
		this.setVente(venteV);
		this.setDebut(debutV);
		this.setFin(finV);
		
	}
	
	public void addRdvVisite(Date date, Client client) {
		
		listeRdvVisite.put(date, client);
		
	}

	/**
	 * @return the prix
	 */
	public int getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(int prix) {
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

}
