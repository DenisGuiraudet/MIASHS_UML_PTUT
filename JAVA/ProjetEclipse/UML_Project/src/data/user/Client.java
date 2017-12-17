package data.user;

import java.util.ArrayList;

public abstract class Client {

	private String nom;
	private String adresse;
	private String telephone;
	private String email;
	private ArrayList<Envie> listeEnvie;
	
	public Client(String nomV, String adresseV, String telephoneV, String emailV) {
		
		this.setNom(nomV);
		this.setAdresse(adresseV);
		this.setTelephone(telephoneV);
		this.setEmail(emailV);
		this.listeEnvie = new ArrayList<Envie>();
		
	}
	
	public void ajouterEnvie(Envie envie) {
		
		this.listeEnvie.add(envie);
		
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
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return the listeEnvie
	 */
	public ArrayList<Envie> getListeEnvie() {
		return listeEnvie;
	}
	
}
