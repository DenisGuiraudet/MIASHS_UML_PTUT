package data.agence;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import data.immo.Appartement;
import data.immo.BienImmo;
import data.immo.Maison;
import data.immo.Terrain;
import data.pub.AnnoncePub;
import data.pub.TypePub;
import data.user.Client;
import data.user.Entreprise;
import data.user.Personne;

public class Agence {
	
	private String nom;
	private ArrayList<BienImmo> listeBien;
	private ArrayList<Client> listeClient;
	private ArrayList<Mandat> listeMandat;
	private ArrayList<Promesse> listePromesse;
	private ArrayList<Notaire> listeNotaire;
	private ArrayList<AnnoncePub> listeAnnonce;
	
	public Agence(String nomV) {

		this.nom = nomV;
		this.listeBien = new ArrayList<BienImmo>();
		this.listeClient = new ArrayList<Client>();
		this.listeMandat = new ArrayList<Mandat>();
		this.listePromesse = new ArrayList<Promesse>();
		this.listeNotaire = new ArrayList<Notaire>();
		this.listeAnnonce = new ArrayList<AnnoncePub>();
		
	}
	
	public void creerPersonne(String nomV, String adresseV, String telephoneV, String emailV) {
		
		this.listeClient.add(new Personne(nomV, adresseV, telephoneV, emailV));

	}
		
	public void creerEntreprise(String nomV, String adresseV, String telephoneV, String emailV,
			String formeJuridiqueV, String numSirenV) {
		
		this.listeClient.add(new Entreprise(nomV, adresseV, telephoneV, emailV, formeJuridiqueV, numSirenV));

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
		
		mandatV.addRdvVendeur(dateV, clientV);
		
		// TODO : creerPromesse();
		// Peut changer ? => action a part
		
	}
	
	private void creerPromesse(Double prixVerseVendeurV, String adresseNotaireV, Date venteV, Double commissionAgenceV, Double fraisVenteV,
			BienImmo bienV, Client acheteurV, Notaire notaireV) {
		
		this.listePromesse.add(new Promesse(prixVerseVendeurV, adresseNotaireV, venteV, commissionAgenceV, fraisVenteV, bienV, acheteurV, notaireV));
		
	}
	
	public void creerNotaire(String nomV, String adresseV) {
		
		this.listeNotaire.add(new Notaire(nomV, adresseV));
		
	}
	
	public void voirStats() {
		
		// TODO
		
	}
	
	public void creerDocument() {
		
		this.listeAnnonce.add(new AnnoncePub());
		
	}
	
	public void ajouterPub(AnnoncePub annoncePubV, TypePub typePubV) {
		
		annoncePubV.ajouterPub(typePubV);
		
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
	 * @return the listeBien
	 */
	public ArrayList<BienImmo> getListeBien() {
		return listeBien;
	}
	
	/**
	 * @return the listeClient
	 */
	public ArrayList<Client> getListeClient() {
		return listeClient;
	}
	
	/**
	 * @return the listeMandat
	 */
	public ArrayList<Mandat> getListeMandat() {
		return listeMandat;
	}
	
	/**
	 * @return the listePromesse
	 */
	public ArrayList<Promesse> getListePromesse() {
		return listePromesse;
	}
	
	/**
	 * @return the listeNotaire
	 */
	public ArrayList<Notaire> getListeNotaire() {
		return listeNotaire;
	}
	
	/**
	 * @return the listeAnnonce
	 */
	public ArrayList<AnnoncePub> getListeAnnonce() {
		return listeAnnonce;
	}
	
}
