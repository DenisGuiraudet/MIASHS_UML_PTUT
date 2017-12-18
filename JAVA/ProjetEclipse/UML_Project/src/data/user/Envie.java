package data.user;

public class Envie {

	private String type;
	private Double prix;
	private String localisation;
	private Double surfaceSol;
	private int nbPieces;
	
	public Envie(String typeV, Double prixV, String localisationV, Double surfaceSolV, int nbPiecesV) {
		
		this.setType(typeV);
		this.setPrix(prixV);
		this.setLocalisation(localisationV);
		this.setSurfaceSol(surfaceSolV);
		this.setNbPieces(nbPiecesV);
		
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
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
	 * @return the localisation
	 */
	public String getLocalisation() {
		return localisation;
	}

	/**
	 * @param localisation the localisation to set
	 */
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
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
	
	@Override
	public String toString() {
		return (getType() + "-" + getPrix() + "-" + getLocalisation() + "-" + getSurfaceSol() + "-" + getNbPieces() + "\n");
	}
	
}
