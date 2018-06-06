package Sorting;

public class MaxandMin {

	public static void main(String args[]) {

		int ia[] = { 1211, 1, 43, 6477, 123, 45886, 3345 };
		int Max = max(ia);
		int Min = min(ia);
		
		System.out.println("Max-"+Max+" Min-"+Min);

	}
	
	
	
	public static int max(int ia[]){
		
		int max = ia[0];
		for (int i = 0; i < ia.length; i++) {
			if (max < ia[i]) {
		
				max = ia[i];
			} 
		}
		return max;
	}
	
	
	
	
public static int min(int ia[]){
		
		int min = ia[0];
		for (int i = 0; i < ia.length; i++) {
			if (min > ia[i]) {
		
				min = ia[i];
			} 
		}
		return min;
	}
}
