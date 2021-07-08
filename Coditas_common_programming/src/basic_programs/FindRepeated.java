//PROGRAM FOR ARRAYLIST IMPLEMENTATION

package basic_programs;
import java.util.Scanner;

public class FindRepeated {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements you want to add");
		n=sc.nextInt();
		
		int arr[]=new int[10];
		
		System.out.println("take the input for an array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("final array output");
		for(int i=0;i<n;i++)
		System.out.println(arr[i]);

	}

}
