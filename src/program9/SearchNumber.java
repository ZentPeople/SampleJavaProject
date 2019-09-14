package program9;

import java.util.Scanner;

public class SearchNumber {

	public static void main(String[] args) {
		
//		Get number as input
		System.out.println("Enter the number series");
		Scanner scan = new Scanner(System.in);
		long numberSeries = scan.nextLong();
		System.out.println("Enter the number to seaarch");
		int numberToSearch = scan.nextInt();
		scan.close();
		int count = 0;
//		Searching the number
		
		boolean nextLoop = true;
		do{
			long reminder = numberSeries%10; 
			numberSeries = numberSeries/10;
			if(reminder == numberToSearch) {
				count++;
			}
			if(numberSeries==0) {
				nextLoop=false;
			}
		}while(nextLoop);
		
		System.out.println("The total number of occurance of "+numberToSearch+ " in the number series"+numberSeries+" is "+ count);
		

	}

}
