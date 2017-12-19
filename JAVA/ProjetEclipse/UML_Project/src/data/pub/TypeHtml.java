package data.pub;

public class TypeHtml extends TypePub {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		return ("\n- Html : " + super.toString());
	}

}
