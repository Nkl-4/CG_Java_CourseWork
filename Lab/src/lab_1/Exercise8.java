package lab_1;

import java.util.Scanner;

class Exercise8 {
	boolean checkNumber(int number){
		
		if (number == 0){
			return false;}
		
		while(number != 1){
			if(number % 2 != 0){
			return false;}
			
			number /= 2;
			}
			return true;
		}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = in.nextInt();
		in.close();
		
		Exercise8 ex8 = new Exercise8();
		
		boolean val = ex8.checkNumber(num);
		
		System.out.print(val);
		}
}