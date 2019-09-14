package program10;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
//		Get length and width
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length and width");
		int length = scan.nextInt(), width = scan.nextInt();
		scan.close();
		
//		Printing the rectangle
		for(int i = 1; i<= width; i++) {
			if(i ==1 || i==width) {
				for(int j =1 ; j<=length;j++) {
					System.out.print("*");
				}
				
			}else {
				
				for(int j =1 ; j<=length;j++) {
					if(j==1 || j ==length) {
					System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			
			System.out.println("\n");
		}
				
		
	}
}
