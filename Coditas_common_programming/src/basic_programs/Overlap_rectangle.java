//PROGRAM WHETHER TWO RECTANGLE IS OVERLAPPING OR NOT


package basic_programs;

import java.util.Scanner;

public class Overlap_rectangle {

	public static void main(String[] args) {
		int length1, width1, length2, width2;
		int area1, area2;
		Scanner sc = new Scanner(System.in);
		System.out.println("to find the area of both the rectangles");
		System.out.println("enter the length and width of 1st rectangle");
		length1 = sc.nextInt();
		width1 = sc.nextInt();
		area1 = length1 * width1;
		System.out.println("area of 1st rectangle is="+area1);
		
		
		System.out.println("enter the length and width of 2nd rectangle");
		length2=sc.nextInt();
		width2=sc.nextInt();
		area2=length2*width2;
		System.out.println("area of 2nd rectangle is="+area2);
		
		if(area1==area2)
		{
			System.out.println("rectangle R1  is overlapping R2");
			
		}
		else
		{
			System.out.println("rectangle R1  is not overlapping R2");
		}
		
		
		
	}

}







