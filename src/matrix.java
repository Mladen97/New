import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		
//		Scanner input= new Scanner(System.in);
//		System.out.println("Vyvedete broi :");
//		int size=input.nextInt();
		int arr[]={2,1,1,3,4,4,4,5,6};
		int br=0;
		for (int i = 0; i < arr.length ; i++) {
			if(arr[i]==arr[i-1]){
				br=arr[i];
				System.out.print(br);
			}
			
		}
}	}


