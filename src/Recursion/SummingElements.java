package Recursion;

public class SummingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]={1,2,3,4,5};
		
		System.out.println(sum(ar, 4));
		
		
	}
	
	public static int sum(int ar[],int n){
		int sum=0;
		if(n==1)
			sum = ar[0];
		else
		{
			sum=ar[n-1]+sum(ar,n-1);
		}
		
		return sum;
	}
	
}
