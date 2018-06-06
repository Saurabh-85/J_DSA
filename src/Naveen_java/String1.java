package Naveen_java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "saurabh dwivedi";
		char ca[] = s.replace(" ", "").toLowerCase().toCharArray();
		HashMap<Character, Integer> hp = new HashMap<>();

		for (char c : ca) {

			Integer count = hp.get(c);

			if (count == null)
				hp.put(c, 1);
			else
				hp.put(c, hp.get(c) + 1);
		}

		System.out.println("------" + hp);
		LinkedHashMap<Character, Integer> hpfinal = new LinkedHashMap<>();

		Set<Entry<Character, Integer>> entryset = hp.entrySet();

		for (Entry<Character, Integer> entry : entryset) {
			// System.out.print(entry.getKey()+"----"+entry.getValue());
			if (entry.getKey()=='a' ||entry.getKey()=='e'||entry.getKey()=='i'||entry.getKey()=='o'||entry.getKey()=='u' )
				hpfinal.put(entry.getKey(), entry.getValue());

		}

		System.out.print(hpfinal);

	}

}
