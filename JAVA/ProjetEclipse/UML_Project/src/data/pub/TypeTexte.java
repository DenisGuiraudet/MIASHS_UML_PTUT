package data.pub;

public class TypeTexte extends TypePub {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String texte;

	public TypeTexte(String texteV) {
		
		this.texte = texteV;
		
	}
	
	@Override
	public String getElem() {
		
		return this.texte;
		
	}
	
	@Override
	public String toString() {
		return ("\n- Texte : " + super.toString());
	}

}
