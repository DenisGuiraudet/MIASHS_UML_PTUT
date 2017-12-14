package data.immo;

import java.util.Date;

import data.user.Envie;

public class Terrain extends BienImmo {
	
	private Double surfaceSol;
	private Double longueurFacade;

	public Terrain(int numV, String adresseV, String orientationV, Double prixV, Date venteV,
			Double surfaceSolV, Double longueurFacadeV) {
		
		super(numV, adresseV, orientationV, prixV, venteV);
		
		this.setSurfaceSol(surfaceSolV);
		this.setLongueurFacade(longueurFacadeV);

	}
	
	@Override
	public Double correspondance(Envie envie) {

		
		
		return super.correspondance(envie);
		
	}

	/**
	 * @return the surfaceSol
	 */
	public Double getSurfaceSol() {
		return surfaceSol;
	}

	/**
	 * @param surfaceSol the surfaceSol to set
	 */
	public void setSurfaceSol(Double surfaceSol) {
		this.surfaceSol = surfaceSol;
	}

	/**
	 * @return the longueurFacade
	 */
	public Double getLongueurFacade() {
		return longueurFacade;
	}

	/**
	 * @param longueurFacade the longueurFacade to set
	 */
	public void setLongueurFacade(Double longueurFacade) {
		this.longueurFacade = longueurFacade;
	}

}
