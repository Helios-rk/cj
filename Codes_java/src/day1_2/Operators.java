package day1_2;

public class Operators {

	public static void main(String[] args) {
		//1. Arithmetic operators + - * / %
		int a=30,b=20;
		System.out.println("sum of a and b is:"+(a+b));
		System.out.println("difference of a and b is:"+(a-b));
		System.out.println("multiplication of a and b is:"+(a*b));
		System.out.println("division of a and b is:"+(a/b));
		System.out.println("modulas of a and b is:"+(a%b));
		
		//2. Relational/comparison operators > >= < <= != ==
		//it returns boolean value
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		b=30;
		System.out.println(a>=b);
		System.out.println(a<=b);
		
		//3. Logical operators && || !
		// it returns boolean value
		// works between two boolean value
		// && operator returns true when both values are true
		// || operator returns true when any one value is true
		// ! returns opposite value
		
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		boolean b1=10>20;
		boolean b2=20>10;
		System.out.println(b1+ " "+" " +b2);
		
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		System.out.println(!b2);
		System.out.println(!b1);
		System.out.println((10<20) && (20>10));
	}

}

/* operators +,-
 * operands a,b,c,x,y,z
 * 
 * 
 * 
 * 
 * */
 