package data.pub;

public class TypeVid extends TypePub {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String vid;

	public TypeVid(String vidV) {

		this.vid = vidV;
		
	}
	
	@Override
	public String getElem() {

		return this.vid;
		
	}
	
	@Override
	public String toString() {
		return ("\n- Vid : " + super.toString());
	}

}
