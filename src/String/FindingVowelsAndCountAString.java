package String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FindingVowelsAndCountAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "welcome to java fundamentals inheritedaaaaa";
		
		char ca[] = s.replace(" ", "").toCharArray();
		
		LinkedHashMap<Character, Integer> hashmap = new LinkedHashMap<Character,Integer>();
		
		for(char c : ca){
			Integer count = hashmap.get(c);			
			if(count == null){
				hashmap.put(c, 1);
			}
			else
				hashmap.put(c, hashmap.get(c)+1);
		}
		System.out.println(hashmap);	
		
		HashMap<Character, Integer> hashmaFinal = new HashMap<Character,Integer>(); 
		Set<Entry<Character, Integer>> entryset = hashmap.entrySet();
		
		for (Entry<Character, Integer> entry : entryset){
			if(entry.getKey().equals('a')|| entry.getKey().equals('e') || entry.getKey().equals('i')|| entry.getKey().equals('o')||entry.getKey().equals('u')){
				hashmaFinal.put(entry.getKey(), entry.getValue());				
			}			
		}
		System.out.println(hashmaFinal);
		
		}
		
		
		
		
		

		
		
		
		
	}


