package program4;

public class MultiplesOfFive {

	public static void main(String[] args) {
		
		int odd[] = new int[100] ,even[] = new int[100],j=0,k=0,number = 30;
		for (int i =1; i<=number;i++) {
			
//			Printing Table
			System.out.println("5 x "+i+" = "+ 5*i);
			
//			Computing odd or even
			if((5*i)%2==0) {
				even[j]=5*i;
				
				j++;
			}else {
				odd[k]=5*i;
				k++;
			}
		}
		
//		Printing odd or even numbers
		System.out.println("Even Numbers \t\t Odd Numbers");
		int i =0;
		do {
			System.out.println("\t" +even[i]+"\t\t\t"+odd[i]);
			i++;
		}while (even[i] !=0 || odd[i]!=0);
		
//		Printing total number of odd and even
		System.out.println("The total odd numbers are "+ k +" and total even numbers are "+ j);
	}

}
