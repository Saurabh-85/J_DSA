package Naveen_java;

public class SwappintTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "First";
		String s2 = "Second";

		s1 = s1 + s2;

		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
				
		System.out.println("s1-" + s1 + "---" + "s2-" + s2);

		
		String s = "FirstWorld";
		
		String a =s.substring(5);
		String b =s.substring(0, 5);
		
		
		System.out.println(a+"---"+b);
		
		
	}

}
