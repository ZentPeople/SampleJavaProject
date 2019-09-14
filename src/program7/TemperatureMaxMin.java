package program7;

import java.util.Scanner;

public class TemperatureMaxMin {

	public static void main(String[] args) {
		
		float temperature[] = new float[100];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the count of Temperatures");
		int count = scan.nextInt();
		
//		Temperature Input
		System.out.println("Enter the "+count+" Temperature Values");
		for(int i =0; i<count; i++ ) {
			temperature[i] = scan.nextFloat();
			if(temperature[i]==0) {
				System.out.println("Temperature cannot be 0");
			}
			
		}
		scan.close();
		System.out.println("The minimum value is "+getMin(temperature)+" and the maximum value is "+ getMax(temperature));
	}
	
//	Function to return maximum value in the array
	public static float getMax(float temperature[]) {
		float maxValue = temperature[0];
		for(int i =0; temperature[i] !=0 ; i++) {
			if(maxValue<temperature[i]) {
				maxValue = temperature[i];
			}
		}
		return maxValue;
		
	}
	
//	Functio to return the minimum value in the array
	public static float getMin(float temperature[]) {
		float minValue = temperature[0];
		for(int i =0; temperature[i] !=0 ; i++) {
			if(minValue>temperature[i]) {
				minValue = temperature[i];
			}
		}
		return minValue;
		
	}

}
