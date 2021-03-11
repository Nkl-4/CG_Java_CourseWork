// method to find the sum of the cubes of the digits of an n digit number
package lab_1;

public class Exercise1 {
	
	public static int cubeSum(int n) {
		int sum = 0;
		int x;
		
		while(n != 0) {
			x= n%10;
			sum += Math.pow(x, 3);
			n /= 10;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		int n = 123;
		System.out.println(cubeSum(n));
	}
}
