package lab_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LabFive {

	public static void main(String[] args) {
		int[] arr = {23, 77, 12, 42, 99, 2, 19};
		
		System.out.print(getSecondSmallest(arr));

	}
	
	public static int getSecondSmallest(int[] arr) {
		List<Integer> temp = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			temp.add(arr[i]);
		}
		
		Collections.sort(temp);
		
		
		return (int) temp.get(1);
	}

}
