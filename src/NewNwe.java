import java.util.Scanner;

public class NewNwe {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("����: ");
		String symbol=  input1.next();
		
		System.out.println("������� ����� ");
		int n = input1.nextInt();

		System.out.println("������� ����� ");
		int   m= input1.nextInt();

		switch(symbol){
		case "+": System.out.println(n + "+" + m + " = " + (n+m)); break; 
		case "-": System.out.println(n + "-" + m + " = " + (n-m));break;
		case "*": System.out.println(n + "*" + m + " = " + (n*m));break;
		case "/": System.out.println(n + "/" + m + " = " + (double)(n/m)); break;
		default : System.out.println("����������� ���� � ���������");
		}

	}

}
