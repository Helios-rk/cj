package Que;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int rem, sum = 0, temp, n = 898;
		temp = n;
		while (n > 0) {
			rem = n % 10;
			sum = sum * 10 + rem;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("number is a palindrome");
		} else {
			System.out.println("number is not a palindrome");
		}

		// 2nd way to do it.
		String original, reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number/string");
		original = sc.nextLine();
		// int length=original.length();
		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}

		if (original.equals(reverse)) {
			System.out.println("Entered input is a palindrome");
		} else {
			System.out.println("Entered input is not a palindrome");
		}
		sc.close();
	}

}
