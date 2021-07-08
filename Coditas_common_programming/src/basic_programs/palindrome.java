//PROGRAM FOR PALINDROM NUMBER

package basic_programs;

public class palindrome {

	public static void main(String[] args) {
	int n=121,r;
	int rev=0;
	int temp=n;
	
	while(n>0)
	{
		r=n%10;
		rev=(rev*10)+r;
		n=n/10;
	}
	if(temp==rev)

	{
		System.out.println("the number is palindrome");
		
	}
	else
	{
		System.out.println("the number is not palindrome");
	}
	
	}

}
