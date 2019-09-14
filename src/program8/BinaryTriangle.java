package program8;

import java.util.Scanner;

public class BinaryTriangle {

	public static void main(String[] args) {
		
//		Get number as input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the limit for binary triangel");
		int number = scan.nextInt();
		scan.close();
		
//		Print Binary Triangle
		
		for(int i =0; i<number; i++) {
			
			for (int j =0;j<=i;j++) {
				System.out.print(j%2);
			}
			System.out.print("\n");
		}
		

	}

}
