
public class OddOrEven {

	public static void main(String[] args) {

		int odd[] = new int[100] ,even[] = new int[100],j=0,k=0;
		int number = 30;
		for(int i = 0 ; i<=number;i++) {
			if(i%2==0) {
				even[j]=i;
				j++;
			}else {
				odd[k]=i;
				k++;
			}
		}

		System.out.println("Even Numbers \t\t Odd Numbers");
		int i =0;
		do {
			System.out.println("\t" +even[i]+"\t\t\t"+odd[i]);
			i++;
		}while (even[i] !=0 || odd[i]!=0);


	}

}
