//PROGRAM TO CHECK GIVEN NUMBER IS BINARY OR NOT

package basic_programs;

public class Check_binary {

	public static boolean isBinary(int num) {

		if (num == 0 || num == 1 || num < 0) {
			return false;
		}

		while (num != 0) {

			if (num % 10 > 1) {
				return false;
			}
			num = num / 10;
		}
		return true;
	}

	public static void main(String args[]) {
		
		int N = 1010;

	
		System.out.println(isBinary(N));
	}
}
