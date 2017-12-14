package data.user;

public class Entreprise extends Client {
	
	private String formeJuridique;
	private int numSiren;

	public Entreprise(String nomV, String adresseV, int telephoneV, String emailV
			, String formeJurisiqueV, int numSirenV) {
		
		super(nomV, adresseV, telephoneV, emailV);
		
		this.setFormeJuridique(formeJurisiqueV);
		this.setNumSiren(numSirenV);
		
	}

	/**
	 * @return the formeJuridique
	 */
	public String getFormeJuridique() {
		return formeJuridique;
	}

	/**
	 * @param formeJuridique the formeJuridique to set
	 */
	public void setFormeJuridique(String formeJuridique) {
		this.formeJuridique = formeJuridique;
	}

	/**
	 * @return the numSiren
	 */
	public int getNumSiren() {
		return numSiren;
	}

	/**
	 * @param numSiren the numSiren to set
	 */
	public void setNumSiren(int numSiren) {
		this.numSiren = numSiren;
	}

}
