//PROGRAM FOR INSERTION SORT

package basic_programs;

public class Insertion_sort {

	public static void insertionSort(int array[]) {
		int n = array.length;
		for (int j = 1; j < n; j++) {
			int key = array[j];
			int i = j - 1;
			while ((i > -1) && (array[i] > key)) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}
	}

	public static void main(String a[]) {
		int[] arr1 = { 30, 2, 90, 4, 55, 450 };

		insertionSort(arr1);// sorting array using insertion sort

		System.out.println("After Insertion Sort");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
	}
}
