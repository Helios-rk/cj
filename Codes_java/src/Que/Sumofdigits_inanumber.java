package Que;

import java.util.Scanner;

public class Sumofdigits_inanumber {

	public static void main(String[] args) {

		int num, digit, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers ");
		num = sc.nextInt();
		while (num > 0) {
			digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		System.out.println(sum);
		// sc.close();

		long number, sumof;
		System.out.println("enter the long numbers ");
		number = sc.nextLong();
		for (sumof = 0; number != 0; number = number / 10) {
			sumof = sumof + number % 10;
		}
		System.out.println(sumof);

	}

}
