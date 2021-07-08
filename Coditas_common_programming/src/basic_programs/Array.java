package basic_programs;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int arr[]=new int[5];
		int n;int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elments for array");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		sum=sum+arr[i];
		
		
		System.out.println(arr[i]);
		
		}
		
	}
}



