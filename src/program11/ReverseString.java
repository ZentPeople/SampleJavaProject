package program11;


import java.util.Scanner;


public class ReverseString {
	public static void main(String[] args) {
		
//		Getting String as input
		System.out.println("Enter the String to reverse");
		Scanner scan = new Scanner(System.in);
		String inputString = scan.nextLine();
		scan.close();
		
//		Reversing Words
		String arrayOfString[] = inputString.split("\\s");
		int stringLength = arrayOfString.length;
		int j = stringLength - 1;
		for(int i =0 ;i< stringLength; i++,j--) {
			System.out.print(arrayOfString[j]+" ");
			
		}
		
		
		
	}

}
