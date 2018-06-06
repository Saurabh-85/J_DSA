package String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRecurringCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Morning";

		char ca[] = s.toCharArray();

		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();

		for (char c : ca) {
			// System.out.println(c);
			Integer count = hm.get(c);
			if (count == null)
				hm.put(c, 1);
			else
				hm.put(c, hm.get(c) + 1);
			System.out.println(hm);
		}
		System.out.println(hm);

		Set<Entry<Character, Integer>> entryset = hm.entrySet();

		for (Entry<Character, Integer> entry : entryset) {
			int item = entry.getValue();
			if (item == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}

	}

}
