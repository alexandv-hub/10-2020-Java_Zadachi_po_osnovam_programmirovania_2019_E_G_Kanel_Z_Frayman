package chapter19;

public class Task_19_6 {
	/*
	 * Напишите метод, который получает в качестве параметра массив и 
выводит на экран содержащиеся в нем значения в одну строку через 
пробел между значениями.
	 */
	
	public static void printMassive (int []a) {
		for (int i=0; i<a.length; i++) {
		System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		int [] a = {5, 6, 98, 75, 83, 81, 90};
		printMassive(a);
	}

}
