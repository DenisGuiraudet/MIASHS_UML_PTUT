package data.user;

public class Entreprise extends Client {
	
	private String formeJuridique;
	private String numSiren;

	public Entreprise(String nomV, String adresseV, String telephoneV, String emailV
			, String formeJurisiqueV, String numSirenV) {
		
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
	public String getNumSiren() {
		return numSiren;
	}

	/**
	 * @param numSiren the numSiren to set
	 */
	public void setNumSiren(String numSiren) {
		this.numSiren = numSiren;
	}
	
	@Override
	public String toString() {
		return (super.toString() + "-" + getFormeJuridique() + "-" + getNumSiren());
	}

}
