import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("������� ������� ����: ");
		double d = in.nextInt();
		
		System.out.println("������� ������ ����: ");
		double h = in.nextInt();
		
		System.out.println("������� ������ ������:");
		double r = in.nextInt();
		
		double p = Math.PI;
		double s = p * Math.pow(d, 2)/4;
		System.out.println("������� ������ ����:" + s);
		
		double sb = p * d * h;
		System.out.println("������� ������� ����������� ��������:" + sb);
		
		double banki = (s + sb) / r;
		int result = (int) Math.ceil(banki);
		System.out.println("���������� �����:" + result);
		

	}
	
	
//	��������, ����������� ����� ��������� ������� ���� �������������� �����. ��� ���� ��� ������
//	������ ������� ����� � ������ � ������� �������.
//	����������� ��������� ���������, ������� �� ����������, ������� ����� ������ ���������� 
//	��� �������� ���� ��� ����� ����.
//
//	�������
//	��������� ������ ����������� � ������������ ��������� ����������:
//	1)������� ����;
//	2)������ ����;
//	3)������ ������ (������� �����������, ������� ����� ��������� ����� ������ ������).
//	
//
//	� ���������� ��������� ������ �������� ���������� ��������� �����. ��� ��������� �������� ����� 
//	���������� ������ ������ ����������� � ������� �������.
//	������� ����� ���� (�����) ����������� �� ������� p * d2 /4 (��� p � ����� ��, d - �������).
//	������� ������� ����������� ��������: p * d * h (��� h � ������).


}
