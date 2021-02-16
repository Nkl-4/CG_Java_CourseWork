// Return the resulting array after reversing the numbers and sorting it 

import java.util.Arrays;

class Exercise3 {
    int[] getSorted(int[] arr){
        
        for (int i=0; i< arr.length; i++){
            String rev = String.valueOf(arr[i]);
            rev = new StringBuffer(rev).reverse().toString();
            arr[i] = Integer.valueOf(rev);
        }
        
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args){
        int[] array = {21, 17, 531, 48, 34};
        Exercise3 ex3 = new Exercise3();

        System.out.println(Arrays.toString(ex3.getSorted(array)));
    }
}