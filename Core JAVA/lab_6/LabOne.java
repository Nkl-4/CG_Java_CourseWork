package lab_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class LabOne {
	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<String,String> ();
		
		map.put("UK", "London");
		map.put("India", "New Delhi");
		map.put("Russia", "Mascow");
		map.put("US", "Washington");
		
		List<String> finalList = getValues(map);
		System.out.print(finalList);
	}
	
	//Get the values of a map in sorted order
	static List<String> getValues(HashMap<String, String> map) {
		
		List<String> lst = new ArrayList<String>(map.values());
		Collections.sort(lst);
		
		return lst;
	}
}
