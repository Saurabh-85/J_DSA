package Sorting;

public abstract class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String s1 = "123";
		StringBuffer s2 = new StringBuffer("123");
		System.out.println(s1.concat("abc")+"----"+s2.append("abc"));
		*/
		int ar[] = new int[10];
		
		String s = "abcdrfdlfjdjabccabedc";
		int size = s.length();
		int indexof =0;
		System.out.println(s.indexOf("abc", 0));
		while(indexof<size){
		 	
		if(s.indexOf("abc", indexof)>1){
			System.out.println(s.indexOf("abc", indexof));			
		}	
		}
		
		
	}

}
