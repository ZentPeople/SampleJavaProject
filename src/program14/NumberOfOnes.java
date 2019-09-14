package program14;

import java.util.Scanner;

public class NumberOfOnes {

	public static void main(String[] args) {
		System.out.println("Enter the minimum and maxmum limit");
		//		Getting input
		Scanner scan = new Scanner(System.in);
		int minimumValue = scan.nextInt(), maximumValue = scan.nextInt(), count =0 ;
		scan.close();

		//		Scanning the Ones
		for(int i =minimumValue; i<=maximumValue;i++) {

			int tempVal=i;
			for(int j =1; tempVal !=0 ;j++) {
				if(tempVal%10 ==1) {
					count++;
				}
				tempVal = tempVal/10;
			}
		}
		System.out.println(count);

	}

}
