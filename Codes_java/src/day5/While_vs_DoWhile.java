package day5;

public class While_vs_DoWhile {

	public static void main(String[] args) {
		int i=10;
		while(i<=5) {
			System.out.println(i); //no output as condition is false
			i++;
		}

		int j=10;
		do {
			System.out.println(j); //output 10
			j--;
		}while(j<=5);
	}

}
