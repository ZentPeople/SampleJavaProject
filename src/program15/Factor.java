package program15;

import java.util.Scanner;

public class Factor {





	public static void main(String args[]){
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		number = scan.nextInt();
		scan.close();
		for(int i = 2; i< number; i++) {
			while(number%i == 0) {
				if(checkPrime(i) ==1) {


					System.out.println(i+" ");
				}
				number = number/i;
			}
		}
		if(number >2) {
			System.out.println(number);
		}
	}

	static int checkPrime(int n){  

		int i,m=0,flag=0, result = 2;      
		m=n/2;      
		if(n==0||n==1){  
			result = 0;      
		}else{  
			for(i=2;i<=m;i++){      
				if(n%i==0){      
					result =0;      
					flag=1;      
					break;      
				}      
			}      
			if(flag==0)  { result = 1; }  
		}
		return result;
	}
}


