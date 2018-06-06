package String;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MaximumCountChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "welcome to innnnnnndiaaaa";

		char ca[] = s.replace(" ", "").toCharArray();
		HashMap<Character, Integer> hp = new HashMap<>();
		for (char c : ca) {
			Integer count = hp.get(c);
			if (count == null)
				hp.put(c, 1);
			else
				hp.put(c, hp.get(c) + 1);
		}
		System.out.println(hp);
		
		Set<Entry<Character, Integer>> entryset =hp.entrySet();
		int max = 0;
		Character c = null;
		int result[] = new int[entryset.size()];
		for(Entry<Character, Integer> entry : entryset){
			//max=entry.getValue();
			if(max<entry.getValue()){			
				max=entry.getValue();
				c = entry.getKey();
			}						
		}
		System.out.println("max-"+max+" char "+c);		
	}

}
