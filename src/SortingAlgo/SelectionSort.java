package SortingAlgo;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ia[] = { 4, 5, 6, 1,3,4,56,76,87,9,45 };

		for (int i = 0; i < ia.length - 1; i++) {
			int min_id = i;

			for (int j = i + 1; j < ia.length; j++) {
				if (ia[min_id] > ia[j])
					min_id = j;
			}
			int temp = ia[min_id];
			ia[min_id] = ia[i];
			ia[i] = temp;

		}
		for (int i = 0; i < ia.length; i++) {
			System.out.print("-"+ia[i]);
		}

	}

}
