import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("������� ���: ");
		int year = in.nextInt();
		
		if (year%4 != 0) {
			System.out.println("��� ������������ ���: 365");
		} else {
			
			if (year%100 != 0) {
				System.out.println("��� ���������� ���: 366");
			} else {
				
				if( year%400 != 0) {
					System.out.println("��� ������������ ���: 365");
				} else {
					System.out.println("��� ���������� ���: 366");
				}
			}
			
		}

	}

}




//	���������� ���������� ���� � ����, ������� ������ ������������.
//	� ���������� ���� - 366 ����, ����� ��� � ������� 365. ����������� ������ �������� ��� ���� 
//	��������� ������ �� 4 �� ����������� ��������, ������� �� ������� ������ �� 400.
//	
//	�������
//	�������� ������� ������: 
//	1)��������� ������� �� ��� �� 4. ���� ���, �� ��� ��� ������������.
//	2)���� ��� ������� �� 4, �� ��������� ������� �� �� �� 100. ���� ���, �� ��� ���������� 
//	����������.
//	3)���� ��� ������� �� 100, �� ��� ���� �� ������� �� 400, �� ��� ������������.



