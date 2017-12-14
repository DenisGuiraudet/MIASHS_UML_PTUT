package data.pub;

public class TypeImg extends TypePub {
	
	private String img;

	public TypeImg(String imgV) {

		this.img = imgV;
		
	}
	
	@Override
	public String getElem() {

		return this.img;
		
	}

}
