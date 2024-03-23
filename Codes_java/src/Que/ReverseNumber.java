package Que;

public class ReverseNumber { // using % / = operators

	public static void main(String[] args) {
		int rev = 0;
		int num = 1234;
		for (; num != 0; num /= 10) {
			int mod = num % 10;
			rev = rev * 10 + mod;
		}
		System.out.println(rev);
		rev(num);
	}

	//using while loop instead of for loop
	public static int rev(int num) {

		int rev = 0;
		num = 12345;
		// System.out.println(num); prints the actual value that reversed.
		while (num != 0) {
			int mod = num % 10;
			rev = rev * 10 + mod;
			num = num / 10;

			// System.out.println(rev); prints in pyramid.
		}

		System.out.println(rev);
		return num;
	}

}