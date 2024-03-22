package day3;

public class TernaryOperator {

	public static void main(String[] args) {
		// var=exp? result1:result2;

		/*
		 * int a=40; int b=20; int x=(a>b)? a:b; System.out.println(x);
		 */
		int a = 10;
		int b = 20;
		int x = (1 == 1) ? 10 : 20; // if exprsn is true then 1st value print
		System.out.println(x);

		int y = (1 == 2) ? 30 : 20; // if not 2nd value will print.
		System.out.println(y);

		int age = 15;
		int age1 = 181; // try with 18 or more
		String ele = (age >= 18) ? "Eligible" : "Not Eligible";
		System.out.println(ele);
		String ele1 = (age1 >= 18) ? "Eligible" : "Not Eligible";
		System.out.println(ele1);

	}

}
