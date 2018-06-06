package String;

public class CheckingGivenSubString {
	
	public static void main(String args[]){
		
		String s = "Java consists of Java";
		String sub = "Java";
		int flag = 0;
		String ar[] = s.split(" ");
		
		
		for (String st: ar )
			if (st.equals(sub))
				flag+=1;								
		System.out.println("Flag-"+flag);
		
	}

}
