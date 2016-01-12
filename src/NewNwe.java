import java.util.Scanner;

public class NewNwe {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Знак: ");
		String symbol=  input1.next();
		
		System.out.println("Първото число ");
		int n = input1.nextInt();

		System.out.println("Втората число ");
		int   m= input1.nextInt();

		switch(symbol){
		case "+": System.out.println(n + "+" + m + " = " + (n+m)); break; 
		case "-": System.out.println(n + "-" + m + " = " + (n-m));break;
		case "*": System.out.println(n + "*" + m + " = " + (n*m));break;
		case "/": System.out.println(n + "/" + m + " = " + (double)(n/m)); break;
		default : System.out.println("Въведенията знак е невалиден");
		}

	}

}
