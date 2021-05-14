package chapter10;

public class Task_10_2 {
	/*
	 * Напишите класс, который генерирует и выводит на экран 2 случайных 
целых числа из диапазона «однозначные» (включая и положительные, 
и отрицательные). 
После этого в отдельной строке класс должен вывести наибольшее из 
этих двух чисел - с соответствующим текстовым сообщением.
	 */

	public static void main(String[] args) {
		
		int a = (int) (10*Math.random()-10);
		int b = (int) (10*Math.random()-10);
		System.out.println(a);	
		System.out.println(b);
		
		if (a>b)
			System.out.println("Наибольшее число - это " + a);

		if (a<b)
			System.out.println("Наибольшее число - это " + b);
	}

}
