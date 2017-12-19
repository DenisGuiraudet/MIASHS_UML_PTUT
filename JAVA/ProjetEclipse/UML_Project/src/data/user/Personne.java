
package data.user;

public class Personne extends Client {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Personne(String nomV, String adresseV, String telephoneV, String emailV) {
		
		super(nomV, adresseV, telephoneV, emailV);
		
	}
	
	@Override
	public String toString() {
		return ("\n+ Personne : " + super.toString());
	}

}
