
public class Task12 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int k = 0;
		int sum = 0;
		
		for (int i = 1; i < arr.length; i += 2) {
			
			if(arr[i]%2 == 0) {
				sum = sum + arr[i];
				k = k + 1;
			}
				
		}
		
		System.out.println("Сумма чисел равна:" + sum);
		
		int avr = 0;
		
		if (k != 0) {
			 avr = sum / k;
			 System.out.println("Среднее арифметическое: " + avr);
		} else {
			System.out.println("Такие элементы отсутствуют");
		}

	}

}
