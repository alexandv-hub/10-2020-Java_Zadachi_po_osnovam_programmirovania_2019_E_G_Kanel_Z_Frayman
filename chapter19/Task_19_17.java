package chapter19;

public class Task_19_17 {
	/*
	 * Напишите метод, который получает в качестве параметра массив и 
заполняет его положительными случайными двузначными числами 
так, чтобы первая и вторая половины массива были идентичными. 
	 */

	public static void fillArr (int []a) {
		
		for (int i=0; i<a.length/2; i++) {
			a[i] = 10+(int)( (99-10+1)*Math.random() );

			for (int j = a.length/2; j<a.length; j++) {
				a[j] = a[j-a.length/2];
			}
			
		}

	}

	public static void printArr (int []a) {
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		int [] a;
		a = new int[10];
		fillArr(a);
		printArr(a);
	}

}