package data.pub;

public class TypeVid extends TypePub {
	
	private String vid;

	public TypeVid(String vidV) {

		this.vid = vidV;
		
	}
	
	@Override
	public String getElem() {

		return this.vid;
		
	}

}
