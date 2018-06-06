package Naveen_java;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={1,2,3,4,5,6,7,9};
		int sum = 0;
		int actsum = 0;
		//int n = 9;
		for(int i=0;i<a.length;i++){			
			sum = sum +a[i];			
		}
		
		for(int j=1;j<=9;j++){
			
			actsum =actsum + j;
		}
		
		System.out.println(actsum-sum);
		
	}

}
