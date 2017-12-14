package data.agence;

import java.util.Date;
import java.util.HashMap;

import data.user.Client;

public class Agence {
	
	private String nom;
	private HashMap<Date, Client> listeRdvVendeur;
	
	public Agence(String nomV) {

		this.nom = nomV;
		this.listeRdvVendeur = new HashMap<Date, Client>();
		
	}
	
	public void creerClient(String nomV, String adresseV, int telephoneV, String emailV) {
		
		

	}
	
	public void priseRdvVendeur(Date dateV, Client clientV) {

		
		
	}
	
	public void creerBien() {
		
		
		
		
	}
	
	public void creerMandat(Client clientV, Mandat mandatV) {
		// TODO : pas mandatV ici ducon justement on le creer la
		
		
		
	}
	
	public void organiserVisite(Client clientV, Mandat mandatV, Date dateV) {
		
		
		
	}
	
	public void organiserVente(Client clientV, Mandat mandatV, Date dateV) {
		
		
		
		//creerPromesse();
		
	}
	
	private void creerPromesse(Promesse promesseV) {
		// TODO : pas promesseV ici ducon justement on le creer la
		
		
		
	}
	
	public void voirStats() {
		
		
		
	}
	
	public void creerDocument() {
		
		
		
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

	public void addRdvVendeur(Date date, Client client) {
		
		listeRdvVendeur.put(date, client);
		
	}
	
}
