package data.pub;

public class TypeHtml extends TypePub {
	
	private String html;

	public TypeHtml(String htmlV) {
		
		this.html = htmlV;
		
	}
	
	@Override
	public String getElem() {

		return this.html;

	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
