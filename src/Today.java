import java.util.Scanner;

public class Today {

	public static void main(String[] args) {
		System.out.println("���� �� ����� � 1");
		System.out.println("���� �� ����� � 2");
		System.out.println("���� �� ���� � 3");
		System.out.println("���� �� ��� � 4");
		Scanner input1 = new Scanner(System.in);
		System.out.print("�������� ���, �� �� �� ��������: ");
		int n = input1.nextInt();

		Scanner input4 = new Scanner(System.in);
		System.out.print("�������� ��������� ��: ");
		int v = input4.nextInt();
		String m = "�����";
		String k = "�����";
		String p = "����";
		String j = "���";
		int a = 2;
		int b = 3;
		int c = 1;
		int d = 3;
		int sum=0;
		
		if (v < 18) {
			System.out.println("�� ���� �� �� ������ �������");

		} else {

			while (n != 0) {

				// Scanner input2 = new Scanner(System.in);

				// Scanner input3 = new Scanner(System.in);

				switch (n) {
				case 1:
					System.out.println("��������� ������ ����� � " + m );
					sum+=a;
					break;
				case 2:
					System.out.println("��������� ������ ����� � " + k );
					sum+=b;
					break;
				case 3:
					System.out.println("��������� ������ ����� � " + p );
					sum+=c;
					break;
				case 4:
					sum+=d;
					System.out.println("��������� ������ ����� � " + j );
					break;
				default:
					System.out.println("�� ��� ������� �� ������������ �� �����������.");

				}
				System.out.print("�������� ���, �� �� �� ��������: ");
				n = input1.nextInt();
				

			}
			
		}
		System.out.println(sum);
	}
}
