
public class Task1 {

	public static void main(String[] args) {
		
		 int a = 0; 
	     int b = 900; 
	      
	     int random_number = a + (int) (Math.random() * b); 
	     System.out.println("��������� �����: " + random_number);
	     
	     int firstNumber = random_number/100;
	     int secondNumber = random_number/10%10;
	     int thirdNumber = random_number%10;
	     
	     int summ = firstNumber + secondNumber + thirdNumber;
	     System.out.println(summ);
	     
	     int multiply = firstNumber * secondNumber * thirdNumber;
	     System.out.println(multiply);
		

	}
	
	
//	������������� ��������� �����, ������� �� ����� ��� �����, 
//	� ����� ����� � ������������ ��� ����. ������������� ��������� �����, 
//	������� �� ����� ��� �����, � ����� ����� � ������������ ��� ����.
//
//	�������� ������� ������: 
//	1)random(900) ���������� ��������� ����� �� 0 �� 899. ���� ��������� � ���� 100, 
//	�� ��������� �������� �� 100 �� 999 ������������, �. �. ���������� ��� ����������� �����.
//	2)����� ������� �� ����� ����� ����� ���� ��� ��������� ������ �� 100.
//	3)��� ��������� ����� ������� ����� ������� ��������� ������ �� 10, 
//	� ����� ����� ������� �� ������� �� 10.
//	4)������� ����������� ����� ���������� ������� �� ������� ����� �� 10.

	
	
	

}
