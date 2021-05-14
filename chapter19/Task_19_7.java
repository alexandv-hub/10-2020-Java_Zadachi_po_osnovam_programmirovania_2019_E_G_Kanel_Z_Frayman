package chapter19;

public class Task_19_7 {
	/*
	 * Напишите метод, который получает в качестве параметра массив и 
заполняет его случайными числами в диапазоне О ... 99.
	 */

	public static void fillArr (int []a) {
		for (int i=0; i<a.length; i++) {
		a[i] = 0+(int)( (99-0+1)*Math.random() );
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
