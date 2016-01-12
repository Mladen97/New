import java.util.Scanner;

public class Neww {

	public static void main(String[] args) {
		//System.out.println("Въведете m и n, като m<n.");
		//Scanner input = new Scanner(System.in);
		// System.out.print("Въведете m: ");
		// int m=input.nextInt();
		Scanner input1 = new Scanner(System.in);
		System.out.print("Въведете n: ");
		int n = input1.nextInt();
		// int a=n/1000;
		// int b=n/100%10;
		// int c=n/10%10;
		// int d=n%10;
		// int sum=0;

		for (int i = 1; i <= n; i++) {
			
			 for(int j=1; j<=i; j++){
				System.out.print("*");
				
			 }System.out.println();}
				for (int i = n; i >= 1; i--) {
					
					 for(int j=i; j>1; j--){
						System.out.print("*");}
			
			System.out.println();
			
		}

	}
}
