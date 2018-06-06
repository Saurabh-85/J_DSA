package SortingAlgo;

/*for bestcase O(n)
Average case O(n^2)
worst case O(n^2)*/

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { 2, 7, 3, 1, 4, 67, 34, 54, 45, 89, 7245 };

		for (int j = 0; j < ar.length; j++) {
			int flag=0;
			for (int i = 0; i < ar.length - j-1; i++) {
				if (ar[i] > ar[i + 1]) {
					int temp = ar[i];
					ar[i] = ar[i + 1];
					ar[i + 1] = temp;
					flag=flag+1;
				}
					if(flag == '0')
						break;
			}	

		}
		for (int j = 0; j < ar.length; j++)
			System.out.print("+" + ar[j]);

	}

}
