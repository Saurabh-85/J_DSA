package Naveen_java;

public class ReversingAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Saurabh";
		StringBuffer s1 = new StringBuffer("Saurabh");
		s1=s1.reverse();
		char c[] = s.toCharArray();
		
		
		for (int i=c.length-1;i>=0;i--){		
			System.out.print("-"+c[i]);
		}			
		
		
		System.out.println("----------"+s1);
	}
	
	
	
}
