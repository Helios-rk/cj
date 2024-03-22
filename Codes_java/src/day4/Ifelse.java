package day4;

public class Ifelse {

	public static void main(String[] args) {
		int age=15;
	/*	if(age>=18) {
			System.out.println("eligible to vote");
		}
		else {
			System.out.println("not eligible to vote");
		}
*/
		if(age>=18) //if only single statement can ignore curly brackets
			System.out.println("eligible");
		else
			System.out.println("not eligible");
	}

}
