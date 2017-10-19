
public class Task1 {

	public static void main(String[] args) {
		
		 int a = 0; 
	     int b = 900; 
	      
	     int random_number = a + (int) (Math.random() * b); 
	     System.out.println("Случайное число: " + random_number);
	     
	     int firstNumber = random_number/100;
	     int secondNumber = random_number/10%10;
	     int thirdNumber = random_number%10;
	     
	     int summ = firstNumber + secondNumber + thirdNumber;
	     System.out.println(summ);
	     
	     int multiply = firstNumber * secondNumber * thirdNumber;
	     System.out.println(multiply);
		

	}
	
	
//	Сгенерировать случайное число, вывести на экран это число, 
//	а также сумму и произведение его цифр. Сгенерировать случайное число, 
//	вывести на экран это число, а также сумму и произведение его цифр.
//
//	Алгоритм решения задачи: 
//	1)random(900) генерирует случайное число от 0 до 899. Если прибавить к нему 100, 
//	то получится диапазон от 100 до 999 включительно, т. е. охватывает все трехзначные числа.
//	2)Чтобы извлечь из числа цифру сотен надо его разделить нацело на 100.
//	3)Для получения цифры десяток можно сначала разделить нацело на 10, 
//	а затем найти остаток от деления на 10.
//	4)Единицы извлекаются путем нахождения остатка от деления числа на 10.

	
	
	

}
