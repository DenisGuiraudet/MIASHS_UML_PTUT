package data.immo;

import java.util.Date;

import data.user.Envie;

public class Appartement extends BienImmo {
	
	private int nbPieces;
	private int etage;
	private Double chargesMensuelles;

	public Appartement(int numV, String adresseV, String orientationV, Double prixV, Date venteV,
			int nbPiecesV, int etageV, Double chargesMensuellesV) {
		
		super(numV, adresseV, orientationV, prixV, venteV);
		
		this.setNbPieces(nbPiecesV);
		this.setEtage(etageV);
		this.setChargesMensuelles(chargesMensuellesV);

	}
	
	@Override
	public Double correspondance(Envie envie) {

		
		
		return super.correspondance(envie);
		
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
	 * @return the etage
	 */
	public int getEtage() {
		return etage;
	}

	/**
	 * @param etage the etage to set
	 */
	public void setEtage(int etage) {
		this.etage = etage;
	}

	/**
	 * @return the chargesMensuelles
	 */
	public Double getChargesMensuelles() {
		return chargesMensuelles;
	}

	/**
	 * @param chargesMensuelles the chargesMensuelles to set
	 */
	public void setChargesMensuelles(Double chargesMensuelles) {
		this.chargesMensuelles = chargesMensuelles;
	}
	
	

}
