package program5;

import java.util.Scanner;

public class SumOfOddNUmber {

	public static void main(String[] args) {
		
//		Initiating Scanner Class
		Scanner scan = new Scanner(System.in);
		int number =  scan.nextInt(), sum =0;
		scan.close();
//		Calculating odd number
		for(int i =0 ; i<=number;i++) {
			if(i%2!=0) {
				sum=sum+i;				
			}			
		}
//		Printing Sum
		System.out.println(sum);
	}
}
