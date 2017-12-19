package data.pub;

import java.io.Serializable;

public abstract class TypePub implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getElem() {
		
		return null;
		
	}
	
	@Override
	public String toString() {
		return (getElem());
	}

}
