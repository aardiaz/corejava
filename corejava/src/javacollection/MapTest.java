package javacollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	
	
	public static void main(String[] args) {
		
		//Map<String, String>  hmap = new HashMap<>();
		//Map<String, String>  hmap = new TreeMap<>();
		Map<String, String>  hmap = new LinkedHashMap<>();
		
		hmap.put("Kathmandu", "014");
		hmap.put("Lalitpur", "015");
		hmap.put("Kailali", "091");
		hmap.put("Bhaktapur", "016");
		hmap.put("Doti","094");
		
		for(String key : hmap.keySet()) {
			System.out.println(key+ " = "+hmap.get(key));
		}
		
		
	}

}
