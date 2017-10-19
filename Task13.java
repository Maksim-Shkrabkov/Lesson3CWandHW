import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		
		//Создаем массив
		
		int[] [] arr = {
						{1, 2, 3},
							{4, 5, 6},
								{7, 8, 9},
									{10, 11 , 12}
						 
		};
		
		// Выводим массив на экран
		
		for (int [] a : arr) { 
				for(int b : a) 
					System.out.print(b+" "); 
					System.out.println(); 
		}
		
		// Спрашиваем какие строки заменять
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Какую строку хотите заменить (от 0 до 3) ?:  ");
		int line = in.nextInt();
		
		System.out.println("На какую строку хотите заменить (от 0 до 3)?:  ");
		int lineForExcange = in.nextInt();
		
		// Меняем строки местами
		
		int buffer = 0;
		int i = 0;
		
		for (int j = 0; j < arr[i].length; j++) {

				buffer = arr [line] [j];
				arr [line] [j] = arr [lineForExcange] [j];
				arr [lineForExcange] [j] = buffer;
		
		}
		
		// Выводим массив на экран
		
		for (int [] a: arr) { 
			for(int b: a) 
				System.out.print(b+" "); 
				System.out.println(); 
	}
	}

}
