package day5;

public class Forloop {

	public static void main(String[] args) {
		// print in increasing order
		for(int i=1; i<=10;i++) {
			System.out.println(i);
		}
//print odd number
		for(int i=1;i<=10;i+=2) {
			System.out.println(i);
		}
		
		//print even number
		for(int i=2;i<=10;i+=2) {
			System.out.println(i);
		}
		
		//print even and odd number
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i + " even number");
			}else {
				System.out.println(i + " odd number");
			}
		}
		
		//print in decreasing order
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
	}

}
