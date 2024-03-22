package day3;

public class Increment_decrement {

	public static void main(String[] args) {
		// ++ is increment operator
		int a=10;
		a++;      //a=a+1; both means same //decrement a--, a=a-1
		System.out.println(a);

		//case 2 post increment //post decrement res=a--
		a=10;
		int res=a++;
		System.out.println(res); //prints only 10
		System.out.println(a);
		
		//case 3 pre-increment //post res=--a;
		res=++a; 
		System.out.println(res);
		System.out.println(a);
		
	}

}
