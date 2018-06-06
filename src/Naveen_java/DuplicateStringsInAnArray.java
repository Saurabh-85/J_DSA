package Naveen_java;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateStringsInAnArray {

	public static void main(String args[]) {

		String st[] = { "test", "static", "java", "temp", "static", "main", "java", "test" };
		System.out.println(st.length);

		for (int i = 0; i < st.length; i++) {
			for (int j = 1 + i; j < st.length; j++) {
				if (st[i].equals(st[j])) {

					System.out.println("Duplicate " + st[i] + "----" + st[j]);
				}
			}
		}
		//using hashmap
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
			
			for(String name: st){
				Integer count = hashmap.get(name);
				if(count == null){
					hashmap.put(name, 1);
				}	
				else
					hashmap.put(name, hashmap.get(name)+1);						
			}
		
		
		System.out.println("HM"+hashmap);	
		
		//entryset
		HashMap<String, Integer> hashmapFinal = new HashMap<String, Integer>();
		Set<Entry<String, Integer>> entryset = hashmap.entrySet();
		for(Entry<String, Integer> entry : entryset){
			if(entry.getValue()>1){
				hashmapFinal.put(entry.getKey(), entry.getValue());
			}
		}
		System.out.println(hashmapFinal);
		
	}
}
