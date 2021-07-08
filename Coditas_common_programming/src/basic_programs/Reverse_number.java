//PROGRAM FOR REVERSE NUMBER

package basic_programs;

public class Reverse_number {

	public static void main(String[] args) {
		int r, rev = 0;
		int n = 123;
		while (n != 0) {
			r = n % 10;
			rev = (rev * 10) + r;
			n = n / 10;
		}
		System.out.println("reverse number is=" + rev);

	}

}
