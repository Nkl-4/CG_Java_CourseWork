package lab_5;

import java.util.Scanner;
import com.cg.eis.exception.EmployeeException;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your salary : ");
		int salary = sc.nextInt();
		sc.close();
		
		try {
			checkSalary(salary);
		}
		
		catch (EmployeeException e) {
			System.out.println(e);
		}
	}
	
	static void checkSalary(int amount) throws EmployeeException {
		
		if(amount >= 3000) {
			System.out.println("Your salary is above 3000");
		}
		
		else {
			throw new EmployeeException(amount);
		}
	}

}
