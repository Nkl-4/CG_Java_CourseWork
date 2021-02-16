package lab_4;

public class Exercise1 {

	public static void main(String[] args) {
		
		Person p1 = new Person("Smith", 20);
		Account ac1 = new Account(2000.0, p1);
		
		Person p2 = new Person("Kathy", 23);
		Account ac2 = new Account(3000.0, p2);
		
		
		System.out.println(ac1.getAccNum());
		System.out.print(ac2.getAccNum());

	}

}
