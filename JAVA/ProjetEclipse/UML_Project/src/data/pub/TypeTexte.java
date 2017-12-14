package data.pub;

public class TypeTexte extends TypePub {
	
	private String texte;

	public TypeTexte(String texteV) {
		
		this.texte = texteV;
		
	}
	
	@Override
	public String getElem() {
		
		return this.texte;
		
	}

}
