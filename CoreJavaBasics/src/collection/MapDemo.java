package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		HashMap<Integer , String> hm = new HashMap<Integer, String>();
//		hm.put(1, "Anas");
//		hm.put(2, "Eswar");
//		hm.put(3, "Shobana");
//		
//		System.out.println(hm);
//		
//		//duplicate values allowed but with diffrent key 
//		hm.put(4, "Anas");
//		System.out.println(hm);
//		
//		System.out.println(hm.get(3));
//		
//		Set<Integer> keys = hm.keySet();
//		System.out.println(keys);
//		
//		//retreive all pairs
//		//
//		
//		Set<Map.Entry<Integer,String>> kv = hm.entrySet();
//		for (Map.Entry<Integer,String> k:kv) {
//			System.out.println(k.getKey()+ ":" + k.getValue());
//		}
		
		
		//


		LinkedHashMap<String , Integer> hm1 = new LinkedHashMap<String, Integer>();
		hm1.put( "Gaya", 823001);
		hm1.put( "Chennai", 600041);
		hm1.put( "Hyderabad",500050);
		
		System.out.println(hm1);
		
		//duplicate values allowed but with diffrent key 
		hm1.put("Hazaribagh", 825301);
		System.out.println(hm1);
		
		System.out.println(hm1.get(3));
		
		Set<String> keys1 = hm1.keySet();
		System.out.println(keys1);
		
		//retreive all pairs
		//
		
		Set<Entry<String,Integer>> kva = hm1.entrySet();
		for (Entry<String, Integer> k:kva) {
			System.out.println(k.getKey()+ ":" + k.getValue());
		}
		
	}

}
