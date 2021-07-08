//program for Armstrong number

package basic_programs;

public class Armstrong_number {
	public static void main(String args[]) {
		int n = 123, c = 0, a;
		int temp = n;
		while (n > 0)

		{
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);
		}
		if (temp == c)

		{
			System.out.println("no. is armstrong number");
		} else {
			System.out.println("no. is not armstrong number");
		}

	}

}
