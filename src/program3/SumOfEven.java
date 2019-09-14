package program3;

public class SumOfEven {
	public static void main(String[] args) {

		
		int number = 6 , sum =0;
		for(int i = 0 ; i<=number;i++) {
			if(i%2==0) {
				sum = sum+i;
			}
		}
		
		
		System.out.println("The sum of the first "+number+"even number is " + sum + " which is a "+ oddOrEven(sum) + " Number" );
		
		
		}
		public static String oddOrEven(int number) {
		if(number%2 == 0) {
			return "Even";
		}else{
			return "Odd";
		}
		}
	}


