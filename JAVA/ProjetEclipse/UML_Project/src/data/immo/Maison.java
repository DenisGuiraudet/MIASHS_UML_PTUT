package data.immo;

import java.util.Date;

import data.user.Envie;

public class Maison extends BienImmo {
	
	private Double surfaceHabitable;
	private int nbPieces;
	private int nbEtages;
	private String chauffage;
	private Terrain terrain;

	public Maison(int numV, String adresseV, String orientationV, Double prixV, Date venteV,
			Double surfaceHabitableV, int nbPiecesV, int nbEtagesV, String chauffageV) {
		
		super(numV, adresseV, orientationV, prixV, venteV);
		
		this.setSurfaceHabitable(surfaceHabitableV);
		this.setNbPieces(nbPiecesV);
		this.setNbEtages(nbEtagesV);
		this.setChauffage(chauffageV);
		this.setTerrain(null);

	}
	
	@Override
	public Double correspondance(Envie envie) {

		// TODO
		
		return super.correspondance(envie);
		
	}

	/**
	 * @return the surfaceHabitable
	 */
	public Double getSurfaceHabitable() {
		return surfaceHabitable;
	}

	/**
	 * @param surfaceHabitable the surfaceHabitable to set
	 */
	public void setSurfaceHabitable(Double surfaceHabitable) {
		this.surfaceHabitable = surfaceHabitable;
	}

	/**
	 * @return the nbPieces
	 */
	public int getNbPieces() {
		return nbPieces;
	}

	/**
	 * @param nbPieces the nbPieces to set
	 */
	public void setNbPieces(int nbPieces) {
		this.nbPieces = nbPieces;
	}

	/**
	 * @return the nbEtages
	 */
	public int getNbEtages() {
		return nbEtages;
	}

	/**
	 * @param nbEtages the nbEtages to set
	 */
	public void setNbEtages(int nbEtages) {
		this.nbEtages = nbEtages;
	}

	/**
	 * @return the chauffage
	 */
	public String getChauffage() {
		return chauffage;
	}

	/**
	 * @param chauffage the chauffage to set
	 */
	public void setChauffage(String chauffage) {
		this.chauffage = chauffage;
	}

	/**
	 * @return the terrain
	 */
	public Terrain getTerrain() {
		return terrain;
	}

	/**
	 * @param terrain the terrain to set
	 */
	public void setTerrain(Terrain terrain) {
		this.terrain = terrain;
	}
	
	@Override
	public String toString() {
		return (super.toString() + "-" + getSurfaceHabitable() + "-" + getNbPieces() + "-" + getNbEtages() + "-" + getChauffage() + "-" + getTerrain());
	}

}
