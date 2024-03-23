package Que;

public class Countdigitsina_number {

	public static void main(String[] args) {
		Countdigitsina_number ob=new Countdigitsina_number();
		
		int num = 98765453;
		int count = 0;

		for (; num != 0; num /= 10) {
			count++;
		}
		System.out.println(count);
		ob.count(num);
	}


//using while loop

	public void count(int num) {
		int count = 0;
		num = 12345;
		
		while (num != 0) {
			num /= 10;
			count++;
		}
		System.out.println(count);
		
	}
	}
