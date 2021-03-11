package lab_6;

import java.util.Arrays;

public class LabSeven {

	public static void main(String[] args) {
		int[] array = {12, 82, 33, 49, 57, 91};
		
		System.out.println(Arrays.toString(getSorted(array)));

	}
	
	public static int[] getSorted(int[] arr) {
		
		for (int i=0; i< arr.length; i++){
            String rev = String.valueOf(arr[i]);
            rev = new StringBuffer(rev).reverse().toString();
            arr[i] = Integer.valueOf(rev);
        }
        
        Arrays.sort(arr);
        
        return arr;

	}

}
