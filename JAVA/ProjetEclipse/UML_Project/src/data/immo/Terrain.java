package data.immo;

import java.util.Date;

import data.user.Envie;

public class Terrain extends BienImmo {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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

		// TODO
		
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
	
	@Override
	public String toString() {
		return ("\n+ Terrain : " + super.toString() + "\n- Surface sol : " + getSurfaceSol() + "\n- Longueur facade : " + getLongueurFacade());
	}

}
