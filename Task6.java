import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("������� ����� �����: ");
		int number = in.nextInt();
		
		if (number == 0 ) {
			System.out.println("��� ����");
		} else {
			
			if (number > 0) {
				int op = String.valueOf(Math.abs(number)).length();
				System.out.println("��� ������������� �����" + " � ��� ����� " + op + " " + "������(�).");
			} else {
				int op = String.valueOf(Math.abs(number)).length();
				System.out.println("��� ������������ �����" + "� ��� ����� " + op + " " + "������(�).");
			}
			
		}
		

	}
	
	
//	������������ ������ ����� �����. ���� ������� �� ����� ������� � ���� ����� ���� 
//	� ������������� ��� ��� �������������. ��������, "��� ����������� ������������� �����".
//	����� ���������� ����� ����������, �������� �� ����� �����������, 
//	���������� ��� ����������� � �����.
//
//	�������
//	�������� ������� ������: 
//	1)���������, �� �������� �� ����� �����. ���� ���� � ����������� �����, 
//	�� �� �������� �� �������������, �� �������������.
//	2)����� ����� ��������� ���� ����� � ������� �� ����� ��������������� ���������.
//	3)��������� ���������� ������ � �����, ��������� ���������.

	
}
