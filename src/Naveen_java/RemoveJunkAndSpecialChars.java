package Naveen_java;

public class RemoveJunkAndSpecialChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String s = "sa32598(^^(^ur3048abh";
		
		//regular expression : [^a-zA-Z0-9]
		s=s.replaceAll("[^a-zA-Z]", "");
		System.out.println(s);
		

	}

}
