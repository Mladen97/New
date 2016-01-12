import java.util.Scanner;

public class Today1 {

	public static void main(String[] args) {
		int[] numbers = { 1,2,3,4,5 };
		 int[] numbers1 =new int[numbers.length];
for (int i = 0; i < numbers.length; i++) {
	numbers1[i]=numbers[numbers.length - 1 -i];
//	numbers1[1]=numbers[numbers.length-2];
//	numbers1[2]=numbers[numbers.length-3];
//	numbers1[3]=numbers[numbers.length-4];
//	numbers1[4]=numbers[numbers.length-5];
	System.out.println(numbers1[i]);
}
//		if (numbers[0] == 6 || numbers[numbers.length - 1] == 6) {
//			System.out.println("true");
//
//		}
//
//		else{
//
//			System.out.println("False ");
//	}}
}}
