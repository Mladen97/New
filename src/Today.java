import java.util.Scanner;

public class Today {

	public static void main(String[] args) {
		System.out.println("Кода за уиски е 1");
		System.out.println("Кода за ракия е 2");
		System.out.println("Кода за вино е 3");
		System.out.println("Кода за ром е 4");
		Scanner input1 = new Scanner(System.in);
		System.out.print("Въведете код, за да си поръчате: ");
		int n = input1.nextInt();

		Scanner input4 = new Scanner(System.in);
		System.out.print("Въведете възрастта си: ");
		int v = input4.nextInt();
		String m = "уиски";
		String k = "водка";
		String p = "вино";
		String j = "ром";
		int a = 2;
		int b = 3;
		int c = 1;
		int d = 3;
		int sum=0;
		
		if (v < 18) {
			System.out.println("Не може да се поръча алкохол");

		} else {

			while (n != 0) {

				// Scanner input2 = new Scanner(System.in);

				// Scanner input3 = new Scanner(System.in);

				switch (n) {
				case 1:
					System.out.println("Заповядай твоето питие е " + m );
					sum+=a;
					break;
				case 2:
					System.out.println("Заповядай твоето питие е " + k );
					sum+=b;
					break;
				case 3:
					System.out.println("Заповядай твоето питие е " + p );
					sum+=c;
					break;
				case 4:
					sum+=d;
					System.out.println("Заповядай твоето питие е " + j );
					break;
				default:
					System.out.println("Не сте избрали от предложените ви възможности.");

				}
				System.out.print("Въведете код, за да си поръчате: ");
				n = input1.nextInt();
				

			}
			
		}
		System.out.println(sum);
	}
}
