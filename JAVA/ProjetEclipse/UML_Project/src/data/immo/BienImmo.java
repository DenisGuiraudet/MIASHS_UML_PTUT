package data.immo;

import java.util.ArrayList;
import java.util.Date;

import data.user.Envie;

public abstract class BienImmo {
	
	private int num;
	private String adresse;
	private String orientation;
	private Double prix;
	private Date vente;
	private ArrayList<Date> dispo;
	
	public BienImmo(int numV, String adresseV, String orientationV, Double prixV, Date venteV) {
		
		this.setNum(numV);;
		this.setAdresse(adresseV);
		this.setOrientation(orientationV);
		this.setPrix(prixV);
		this.setVente(venteV);
		this.dispo = new ArrayList<Date>();
		
	}
	
	public Double correspondance(Envie envie) {
		
		return null;
		
	}

	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
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
	 * @return the orientation
	 */
	public String getOrientation() {
		return orientation;
	}

	/**
	 * @param orientation the orientation to set
	 */
	public void setOrientation(String orientation) {
		this.orientation = orientation;
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
	
	public void addDispo(Date dispoV) {
		this.dispo.add(dispoV);
	}
	
	/**
	 * @return the dispo
	 */
	public ArrayList<Date> getDispo() {
		return dispo;
	}
	
	@Override
	public String toString() {
		return ("\n" + getNum() + "-" + getAdresse() + "-" + getOrientation() + "-" + getPrix() + "-" + getVente() + "-" + getDispo());
	}

}
