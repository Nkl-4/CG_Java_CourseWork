package lab_6;

import java.util.HashMap;
//import java.util.Iterator;
import java.util.Map;


public class LabFour {

	public static void main(String[] args) {
		
		Map<Integer,Integer> students = new HashMap<Integer,Integer>();
		
		students.put(101, 72);
		students.put(102, 92);
		students.put(103, 85);
		students.put(104, 50);
		students.put(105, 89);

		System.out.print(getStudents(students).toString());
	}
	
	public static Map<Integer,String> getStudents(Map<Integer,Integer> map){
		
		Map<Integer,String> temp = new HashMap<Integer,String>();
		
//		Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();
//		
//		while(it.hasNext()) {
//			Map.Entry<K, V> pair = 
//		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			Integer regNo = entry.getKey();
			Integer mark = entry.getValue();
			String medal = new String();
			
			if (mark >= 90) {
				medal = "Gold";
			}
			else {
				if (mark >= 80 && mark < 90) {
					medal = "Silver";
				}
				else {
					if (mark >= 70 && mark < 80) {
						medal = "Bronze";
					}
					else {
						medal = "None";
					}
				}
			}
			
			temp.put(regNo, medal);
		}
		
		return temp;
		
	}

}
