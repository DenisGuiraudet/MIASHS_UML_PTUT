package data.agence;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import data.immo.Appartement;
import data.immo.BienImmo;
import data.immo.Maison;
import data.immo.Terrain;
import data.user.Client;
import data.user.Entreprise;
import data.user.Personne;

public class Agence {
	
	private String nom;
	private HashMap<Date, Client> listeRdvVendeur;
	private ArrayList<BienImmo> listeBien;
	private ArrayList<Client> listeClient;
	private ArrayList<Mandat> listeMandat;
	private ArrayList<Promesse> listePromesse;
	private ArrayList<Notaire> listeNotaire;
	
	public Agence(String nomV) {

		this.nom = nomV;
		this.listeRdvVendeur = new HashMap<Date, Client>();
		this.listeBien = new ArrayList<BienImmo>();
		this.listeClient = new ArrayList<Client>();
		this.listeMandat = new ArrayList<Mandat>();
		this.listePromesse = new ArrayList<Promesse>();
		this.listeNotaire = new ArrayList<Notaire>();
		
	}
	
	public void creerPersonne(String nomV, String adresseV, String telephoneV, String emailV) {
		
		this.listeClient.add(new Personne(nomV, adresseV, telephoneV, emailV));

	}
		
	public void creerEntreprise(String nomV, String adresseV, String telephoneV, String emailV,
			String formeJuridiqueV, String numSirenV) {
		
		this.listeClient.add(new Entreprise(nomV, adresseV, telephoneV, emailV, formeJuridiqueV, numSirenV));

	}
	
	public void priseRdvVendeur(Date dateV, Client clientV) {

		this.listeRdvVendeur.put(dateV, clientV);
		
	}
	
	public void creerTerrain(int numV, String adresseV, String orientationV, Double prixV, Date venteV,
			Double surfaceSolV, Double longueurFacadeV) {
		
		this.listeBien.add(new Terrain(numV, adresseV, orientationV, prixV, venteV, surfaceSolV, longueurFacadeV));
		
	}
	
	public void creerMaison(int numV, String adresseV, String orientationV, Double prixV, Date venteV,
			Double surfaceHabitableV, int nbPiecesV, int nbEtagesV, String chauffageV) {
		
		this.listeBien.add(new Maison(numV, adresseV, orientationV, prixV, venteV, surfaceHabitableV, nbPiecesV, nbEtagesV, chauffageV));
		
	}
	
	public void creerAppartement(int numV, String adresseV, String orientationV, Double prixV, Date venteV,
			int nbPiecesV, int etageV, Double chargesMensuellesV) {
		
		this.listeBien.add(new Appartement(numV, adresseV, orientationV, prixV, venteV, nbPiecesV, etageV, chargesMensuellesV));
		
	}
	
	public void creerMandat(Double prixV, Date venteV, Date debutV, Date finV,
			BienImmo bienV, Client vendeurV) {
		
		this.listeMandat.add(new Mandat(prixV, venteV, debutV, finV, bienV, vendeurV));
		
	}
	
	public void organiserVisite(Client clientV, Mandat mandatV, Date dateV) {
		
		mandatV.addRdvVisite(dateV, clientV);
		
	}
	
	public void organiserVente(Client clientV, Mandat mandatV, Date dateV) {
		// TODO : LINK MANDAT TO listeRdvVendeur
		
		this.listeRdvVendeur.put(dateV, clientV);
		
		// TODO : creerPromesse();
		
	}
	
	private void creerPromesse(Double prixVerseVendeurV, String adresseNotaireV, Date venteV, Double commissionAgenceV, Double fraisVenteV,
			BienImmo bienV, Client acheteurV, Notaire notaireV) {
		
		this.listePromesse.add(new Promesse(prixVerseVendeurV, adresseNotaireV, venteV, commissionAgenceV, fraisVenteV, bienV, acheteurV, notaireV));
		
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
