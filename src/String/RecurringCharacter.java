package String;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RecurringCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcdabc";
		String s1="bcdrrdfa";
		String s2="abcdefg";
				
		recurring(s);
		recurring(s1);
		recurring(s2);
		}
	public static void recurring(String s) {
char ca[] = s.toCharArray();
		
		HashMap<Character, Integer> hashmap = new HashMap<>();
		
		for(char c : ca ){
			Integer count = hashmap.get(c);
			if(count == null)
				hashmap.put(c, 1);
			else
				hashmap.put(c,hashmap.get(c)+1);
			
		}
		
		System.out.println(hashmap);
		Set<Entry<Character,Integer>> entryset= hashmap.entrySet();
		
		int flag = 0;
		for(Entry<Character, Integer> entry : entryset){
			
			if(entry.getValue()>1){
				System.out.println("First Recurring Character "+entry.getKey());
				flag++;
				break;
			
			}
			
		}
		
		if (flag == 0)
			System.out.println("None of the element is recurring");
	}	

	
	
	}
	
	
	
	
	

