//PROGRAM TO FIND SECOND HIGHEST IN ARRAY

package basic_programs;

public class Find_second_highest {

	public static void main(String[] args) {
		int temp=0;
		int a[] = { 20, 10, 2, 89, 5, 30 };
		int n=a.length;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (a[i] > a[j])
				temp=a[i];
				a[i] = a[j];
				a[j]=temp;

			}

		}
		System.out.println("array after swapping");

		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
			}
			
			System.out.println("second last highest number in array is"+a[n-1]);
			
			

		}
	}

