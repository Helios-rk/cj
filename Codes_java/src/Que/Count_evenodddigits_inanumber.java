package Que;

import java.util.Arrays;

public class Count_evenodddigits_inanumber {

	public static void main(String[] args) {
	
		   int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Sample array
	        
	        int[] evenNum = new int[num.length];
	        int[] oddNum = new int[num.length];
	        
	        int evenCount = 0;
	        int oddCount = 0;
	        
	        for (int number : num) {
	            if (number % 2 == 0) {
	                evenNum[evenCount++] = number;
	            } else {
	                oddNum[oddCount++] = number;
	            }
	        }
	        
	        // Trimming the arrays to remove unused elements
	        evenNum = Arrays.copyOf(evenNum, evenCount);
	        oddNum = Arrays.copyOf(oddNum, oddCount);
	        
	        System.out.println("Even numbers: " + Arrays.toString(evenNum)+ " Total even numbers "+ evenCount);
	//        System.out.println("Total even numbers: " + evenCount);
	        System.out.println("Odd numbers: " + Arrays.toString(oddNum)+ " Total odd numbers " + oddCount);
//	        System.out.println("Total odd numbers: " + oddCount);
	    

	 
	 }
	
	
	
	}
	
	
	
	