package Naveen_java;

public class MaximumAndMinumum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[] = { 3, 4, 5, 2, 7, 8, 10 };

		int max = ar[0];

		for (int i = 0; i < ar.length; i++) {
			if (max < ar[i])
				max = ar[i];
		}
			System.out.println("max is - "+max);
			
			int min = ar[0];
			for (int i = 0; i < ar.length; i++) {
				if (min > ar[i])
					min = ar[i];
			}
				System.out.println("min is - "+min);
				
	}

}
