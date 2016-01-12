import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		System.out.println("Въведенете цифра от 1 до 9: ");
//		int n= input.nextInt();
		int[] arr=new int[6];
		
		for (int i = 0; i < arr.length; i++) {
		System.out.println("Vyvedete ocenka ot 2 do 6: ");
			arr[i]=input.nextInt();
			if(arr[i]<2 || arr[i]>6){
				System.out.println("Vyvedeno e gresna  ocenka. Molq vyvedente nova ocenka.");
		
		}}
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("Sredniq uspeh e :" + (double)sum/6);
		for (int i = 0; i < arr.length; i++) {
			int j=i;
			int temp;
			while(j>0 && arr[j-1]>arr[j]){
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				j=j-1;
			}
			
		}System.out.println("Nai visokata ocenka e:" + arr[arr.length-1]);
		System.out.println("Nai- niskata ocenka e: " + arr[0]);

			
			
			
			}
		}
	
	


