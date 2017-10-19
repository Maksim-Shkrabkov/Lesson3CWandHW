
public class Task11 {

	public static void main(String[] args) {
		
		int[] array = {120, 121, 122, 123, 124, 128};
		
		int max = array[0];
		
		for (int i = 0; i < array.length; i++) {
			
			if(max < array[i]) {
				max = array[i];
			}
		}
			
		System.out.println("Максимальный элемент в массиве:" + max);
		
		for (int i = 0; i < array.length; i++) {
			
			double divideEachElement = (double) array[i] / max;
			
			System.out.print(divideEachElement + " ");
			
		}
		 
	}

}
