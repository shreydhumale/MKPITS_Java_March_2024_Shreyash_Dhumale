package mapPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
//	public static void main(String[] args) {
//		Map<String, Integer> m1=new HashMap<String, Integer>();
//		m1.put("abc", 1);
//		m1.put("efg", 2);
//		m1.put("xyz", 3);
//		System.out.println(m1.keySet());
//		for(Map.Entry entry: m1.entrySet()) {
//			System.out.println(entry);
//		}
//	}
	
	public static void main(String[] args) {
		Map<String, Integer>m2=new LinkedHashMap<String, Integer>();
		m2.put("pune", 10);
		m2.put("Mumbai", 20);
		m2.put("Delhi", 30);
		System.out.println(m2.keySet());
		System.out.println(m2);
		System.out.println(m2.hashCode());
		
	}
}
