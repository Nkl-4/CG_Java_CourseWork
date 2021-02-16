// class with a method to find the difference between the sum of the squares and the square of the sum of the first n natural numbers

import java.util.Scanner;

class Exercise6{
	int calculateDifference(int n){
		int x = 0;
		int y = 0;
		for(int i=1; i<=n; ++i){
			x += i*i;
			y += i;
		}
		int d = x - (y*y);
		return d;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = in.nextInt();
		int diff;
		
		Exercise6 ex6 = new Exercise6();
		
		diff = ex6.calculateDifference(num);
		System.out.print("Difference = "+ diff);
	}
}