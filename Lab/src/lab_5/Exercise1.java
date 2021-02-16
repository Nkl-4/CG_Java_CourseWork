package lab_5;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		sc.close();
		
		try {
			checkEligibility(age);
		} 
		
		catch (AgeLimitException e) {
			System.out.println(e);
		}

	}

	
	static void checkEligibility(int age) throws AgeLimitException{
		
		if (age >= 15) {
			System.out.println("Eligible");
		}
		else {
			throw new AgeLimitException(age);
		}
	}
} 
