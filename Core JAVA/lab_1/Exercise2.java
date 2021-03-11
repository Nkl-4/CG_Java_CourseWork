// traffic light
package lab_1;

import java.util.Scanner;

public class Exercise2 {
	
	public static void prompt(int n) {
		switch(n) {
		case 1:
			System.out.println("\nStop");
			break;
		case 2:
			System.out.println("\nReady");
			break;
		case 3:
			System.out.println("\nGo");
			break;
		default:
			System.out.println("Enter valid option");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Option \n 1 - Red\n 2 - Yellow\n 3 - Green\n");
		prompt(sc.nextInt());
		sc.close();		
	}

}
