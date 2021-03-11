package lab_5;


public class NameException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String str;
	public NameException(String s) {
		this.str = s;
	}
	
	public String toString() {
		return "Full name should be entered";
	}
	
	
}
