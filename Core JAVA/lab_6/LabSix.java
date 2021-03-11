package lab_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class LabSix {

	public static void main(String[] args) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		map.put(1, 1995);
		map.put(2, 1971);
		map.put(3, 2005);
		map.put(4, 2002);
		map.put(5, 2007);
		
		LabSix lab6 = new LabSix();
		
		System.out.print(lab6.votersList(map).toString());
		
		
	}
	
	public List<Integer> votersList(Map<Integer,Integer> map){
		
		List<Integer> list = new ArrayList<Integer>();
		
		Date date = new Date();
		int year = 1900 + date.getYear();
		
		for(int k: map.keySet()) {
			int age = year - map.get(k);
			
			if (age >= 18) {
				list.add(k);
			}
		}
		return list;
	}

}
