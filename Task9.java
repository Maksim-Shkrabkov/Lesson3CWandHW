import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
				
		for (int i = 0; i <= 100; i++) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("������� ����: ");
		char sign = in.next().charAt(0);
		
		if (sign == '0') {
			break;
		}
		
		if ( sign == '+' || sign == '-' || sign == '/' || sign == '*') {
			
			System.out.println("������� ������ �����: ");
			int firstNumber = in.nextInt();
			
			System.out.println("������� ������ �����: ");
			int secondNumber = in.nextInt();
			
			int result;
			
			switch (sign) {
				case '+': result = firstNumber + secondNumber;
				 		  System.out.println(result);
				 		  break;
				case '-': result = firstNumber - secondNumber;
		 		  	      System.out.println(result);
		 		          break;
				case '*': result = firstNumber * secondNumber;
		 		          System.out.println(result);
		 		          break;
				case '/': if(secondNumber != 0) {
						  result = firstNumber / secondNumber;
					      System.out.println(result);
					 	  break;
						  } else {
							  System.out.println("������� �� ����");
						  } 
				default: System.out.println("������ �������� ����");
					
			}
			
		}
		
		}
				
	}

}
