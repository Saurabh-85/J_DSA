package String;

public class CheckingAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "army";
		String s2 = "msary";
		
		
		
		char ca1[] = s1.toCharArray();
		char ca2[] = s2.toCharArray();
		
		int flag = 0;
		
		for (char c : ca1){
		
			int index = s2.indexOf(c);
			
			if(!(index != -1)){
				flag++;							
			}
			
		
			
		}
		if(flag > 0)
			System.out.println("String are not anagram");
		else
			System.out.println("Strings are anagram");
		
	}

}
