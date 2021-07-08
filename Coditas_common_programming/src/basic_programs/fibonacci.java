//PROGRAM FOR FIBONACCI SERIES

package basic_programs;

public class fibonacci {

	public static void main(String[] args) {
		int x=0,y=1,sum;
		for(int i=1;i<20;i++)
		{
			sum=x+y;
			System.out.println(x+" ");
			x=y;
			y=sum;
		}
		}
}
		
		
		
		
		
