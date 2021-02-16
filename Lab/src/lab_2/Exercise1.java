package lab_2;

//return the second smallest element in the array
import java.util.Scanner;
import java.util.Arrays;

class Exercise1 {
 int getSecondSmallest(int[] arr){
     Arrays.sort(arr);
     return arr[1];
 }

 public static void main(String[] args){
     Scanner in = new Scanner(System.in);
     System.out.print("Enter the size of array : ");
     int len = in.nextInt();

     int[] array = new int[len];
     
     System.out.println("Enter the values");

     for(int i=0; i<len; i++){
         array[i] = in.nextInt();
     }

     Exercise1 ex1 = new Exercise1();
     int val = ex1.getSecondSmallest(array);

     System.out.println("Second Smallest Element => "+val );
     in.close();

 }

}