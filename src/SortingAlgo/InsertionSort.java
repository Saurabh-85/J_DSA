package SortingAlgo;
/*
Bestcase:O(n)
Average Case:O(n^2)
Worst Case:O(n^2)
better than selection and bubble sort*/

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { 14, 63, 75, 86, 97, 10 };

		for (int i = 1; i < ar.length; i++) {
			int value = ar[i];
			int index = i;
			while (index > 0 && ar[i - 1] > value) {

				ar[index] = ar[index - 1];
				index = index - 1;

			}
			ar[index] = value;

		}
		for (int i = 0; i < ar.length; i++)
			System.out.print("-" + ar[i]);
	}

}
