package day5;

public class Loop_itrator_While {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}

		int j=11;
		while(j<=20) {
			System.out.println(j);
			j++;
		}
		
		int k=1;
		while(k<=10) {
			System.out.println("Count");
			k++;
		}
// print even num between 1-10
		int even=2;
		while(even<=10) {
			System.out.println(even);
			even = even+2; // even+=2;
		}
		
		int e=1;
		while(e<=10) {
			if(e%2==0) {
				System.out.println(e);
			}
			e++;
		}
		
	//print even and odd number	
		int all=1;
		while(all<=10) {
			if(all%2==0) {
				System.out.println(all + "is even number");
			}else
				System.out.println(all + "is odd number");
		all++;
		}
		
		// print in reverse 10 to 1
		
		int r=10;
		while(r>=1) {
			System.out.println(r);
			r--;
		}
	}

}
