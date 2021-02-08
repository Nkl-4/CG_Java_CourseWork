//program to calculate sum of first 'n' natural numbers divisible by 3 or 5

import java.util.Scanner;

class Exercise5 {
	public int calculateSum(int n){
		int sum = 0;
		for(int i=1; i<=n; ++i){
			if((i%3==0) || (i%5==0)){
				sum += i;}
		}
		return sum;
		}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = in.nextInt();
		
		Exercise5 ex5 = new Exercise5();
		
		int s = ex5.calculateSum(num);
		
		System.out.println("Sum = " + s);
}}