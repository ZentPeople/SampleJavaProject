package program12;

import java.util.Arrays;
import java.util.Scanner;

public class NumberInAcending {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the 3 numbers");
		Scanner scan = new Scanner(System.in);
		int inputNumbers[] = new int[3];
		for(int i = 0; i<3;i++) {
			inputNumbers[i] = scan.nextInt();
		}
		scan.close();
		Arrays.sort(inputNumbers);
		for(int i=0;i<3;i++) {
			System.out.println(inputNumbers[i]);
		}
	}
}
