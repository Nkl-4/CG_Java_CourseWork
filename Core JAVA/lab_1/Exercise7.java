package lab_1;

//check for increasing number

import java.util.Scanner;

class Exercise7{
	boolean checkNumber(int number){
		int ldigit = number % 10;
		int num = number / 10;
		boolean flag = false;
		
		while(num>0){
			if(ldigit <= num%10){
				flag = true;
				break;
			}
			
			ldigit = num % 10;
			num /= 10;
			}
			return flag;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = in.nextInt();
		in.close();
		
		Exercise7 ex7 = new Exercise7();
		boolean val = ex7.checkNumber(num);
		
		System.out.print(!val);
	}
}