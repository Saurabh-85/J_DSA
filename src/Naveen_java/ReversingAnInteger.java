package Naveen_java;

public class ReversingAnInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 123456789;
		int rev = 0;
		
		while(i!=0){
			rev = rev*10 +i%10;
			i=i/10;
			System.out.println("rev-"+rev+" i-"+i);
			
		}
		
		System.out.println("REV"+rev);
	}

}
