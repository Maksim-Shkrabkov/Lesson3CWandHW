
public class Task4 {

	public static void main(String[] args) {
		
		int number = 1234;
		
		int fisrtNumber = number/1000;
		
		int secondNumber = number/100%10;
		
		int thirdNumber = number/10%10;
		
		int fourNumber = number%10;
		
		int result = (fisrtNumber * secondNumber) + (thirdNumber * fourNumber);
		
		System.out.println(result);

	}
	
	
//	�������� �������������� ����� (abcd). ������� ����� a*b + c*d.
//
//	�������
//	� ������ ������ ����� �������� ��� �����, �.�. �������� ����������� �����.
//	1)��� ���������� ����� �� �������� �������, ���� ����� ������ �������� �� 1000. 
//	(��� ����� ������� �� ������� �� 10000.)
//	2)��� ���������� ������� (�� �����������) �������, ������� ����� ����� �� 100, 
//	����� ����������� �� ������� �������, ����� ������� �� ������� �� 10.
//	3)������ ����� ����������� ����� ��� ������ �� ����������� ����, ��� ������ ������ ���� �� 10.
//	��������� (���������) ����� ����������� ��� ������� �� ������� ��������� ����� �� 10.


}
