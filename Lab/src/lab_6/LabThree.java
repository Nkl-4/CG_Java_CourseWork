package lab_6;

import java.util.Map;
import java.util.HashMap;

public class LabThree {
	public static void main(String[] args) {
		int[] numArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		map = getSquares(numArr);
		
		System.out.print(map.toString());
		
	}
	
	public static Map<Integer, Integer> getSquares(int[] nums) {
		
		Map<Integer, Integer> temp = new HashMap<Integer,Integer>();
		
		for(int i: nums) {
			temp.put(i, i*i);
		}
	
		return temp;
	}
}
