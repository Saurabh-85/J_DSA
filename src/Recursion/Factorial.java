package Recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		for(int i=1;i<1000;i++)
		{
			int fact = rec(i);
			System.out.println(fact);
			n=i;
			if(fact<=0){
				break;
			}
			
		}
		
		System.out.println(n);
		
		

	}
	public static int rec(int n){
		
		if (n == 1)
			return 1;
		else
			return n*rec(n-1);
	
	
	}
}
