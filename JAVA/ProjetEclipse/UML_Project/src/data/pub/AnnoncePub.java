package data.pub;

import java.io.Serializable;
import java.util.ArrayList;

public class AnnoncePub implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<TypePub> listePub;

	public AnnoncePub() {

		this.listePub = new ArrayList<TypePub>();
		
	}
	
	public void ajouterPub(TypePub typePub) {
		
		this.listePub.add(typePub);
		
	}
	
	/**
	 * @return the listePub
	 */
	public ArrayList<TypePub> getListePub() {
		return listePub;
	}
	
	@Override
	public String toString() {
		return ("\n+ Document : " + listePub.toString());
	}

}
