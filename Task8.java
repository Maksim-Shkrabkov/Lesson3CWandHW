import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Task8 {

	public static void main(String[] args) throws IOException, NumberFormatException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine();
		int size = str.length();
		int[] mas= new int[size];
		int x = Integer.parseInt(str);
		
		int y = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < mas.length; i++) {
			if(x%10 == y) {
				i -= 1;
				size -= 1;
			} else {
				mas[i] = x%10;
			}
			x /= 10;
		}
		
		System.out.println(size);
		
		int[] masResult = new int[size];
		
		if(mas.length == masResult.length) {
			System.out.println("have not");
		} else {
			x = 0;
			for(int i = size; i >= 0; i--) {
				x *= 10;
				x += mas[i];
			}
		}
		
		System.out.println(x);
		
	}
	
	
//	Из натурального числа удалить заданную цифру. Число и цифру вводить с клавиатуры.
//	Например, задано число 5683. Требуется удалить из него цифру 8. Получится число 563.
//
//	Решение
//	
//	Задача усложняется тем, что заранее неизвестно количество разрядов числа. Поэтому исходное 
//	число проще начать проверять с конца с помощью оператора mod (нахождения остатка от деления). 
//	Делить надо на 10, чтобы получить последнюю цифру числа.
//	Если последняя цифра не совпадает с цифрой, которую требуется удалить, то ее надо перенести 
//	в другое число, перед этим сдвинув его разряды. Легче реализовать, чтобы новое число 
//	формировалось наоборот: старшие разряды исходного будут младшими.
//	После того, как заданная цифр будет удалена, число снова переворачивается.
//	
//	Пример выполнения программы:
//	38012732
//	3
//	801272

}
