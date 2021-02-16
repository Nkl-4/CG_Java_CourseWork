package lab_1;

//print prime number till given number 

import java.util.Scanner;

class Exercise4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");

        int x = in.nextInt();
        in.close();

        System.out.println("Prime Numbers ");
        int count;
        for(int i = 2; i<= x; i++){
            count = 0;
            for (int j = 1; j<=i; j++){
                if(i%j==0){
                    count++;
                }
            }
            if (count==2){
                System.out.print(i+" ");
            }
        }
    }
}    