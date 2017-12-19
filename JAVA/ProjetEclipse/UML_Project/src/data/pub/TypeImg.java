package data.pub;

public class TypeImg extends TypePub {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String img;

	public TypeImg(String imgV) {

		this.img = imgV;
		
	}
	
	@Override
	public String getElem() {

		return this.img;
		
	}
	
	@Override
	public String toString() {
		return ("\n- Img : " + super.toString());
	}

}
