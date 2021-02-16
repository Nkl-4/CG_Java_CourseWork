package lab_5;

public class AgeLimitException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int age;
	
	AgeLimitException(int age){
		this.age = age;
	}
	
	public String toString() {
		return "Your age should be greater than 15";
	}
}
