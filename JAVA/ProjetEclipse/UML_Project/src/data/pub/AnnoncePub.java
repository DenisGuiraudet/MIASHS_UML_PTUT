package data.pub;

import java.util.ArrayList;

public class AnnoncePub {
	
	private ArrayList<TypePub> listePub;

	public AnnoncePub() {

		this.listePub = new ArrayList<TypePub>();
		
	}
	
	public void ajouterPub(TypePub typePub) {
		
		this.listePub.add(typePub);
		
	}

}
