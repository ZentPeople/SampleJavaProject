package program6;

import java.util.Scanner;

public class NumberSeriesGenerator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Values of N and M");
		int firstNumber = scan.nextInt();
		int secondNumber = scan.nextInt();
		scan.close();
		
		for (int i =1 ; i<= firstNumber; i++) {
			secondNumber = secondNumber-1;
			System.out.print(secondNumber+ " ");
		}
				
				
		
	}

}
