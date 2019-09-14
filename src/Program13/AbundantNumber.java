package Program13;

import java.util.Scanner;

public class AbundantNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int inputNumber = scan.nextInt(), primeNumbers[] = new int[50];
		scan.close();
			
		for(int number =1 ; number<= inputNumber;number++) {
			int primeNumberCount =0, sum =0;

			for(int j =1; j<number;j++) {
				if(number%j == 0) {
					primeNumbers[primeNumberCount] = j;
					sum = sum+j;
				}
			}
			if(sum>number) {
				System.out.print(" "+number);
			}
		}
	}
}
