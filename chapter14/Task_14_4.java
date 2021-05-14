package chapter14;

public class Task_14_4 {
	/*
	 * Напишите класс, который генерирует серию из 50 случайных целых 
чисел из диапазона от -40 до +40, и определяет наибольшее из положи­
тельных значений в сгенерированной серии, а также наименьшее из 
отрицательных значений в сгенерированной серии. 

В случае если одно из нужных значений невозможно определить 
(почему?}, следует вывести на экран соответствующее текстовое со­
общение. 
	 */

	public static void main(String[] args) {
		
		int num, min, max;

		num = -40 + (int)( Math.random() * (40+40+1) );
		min=num;
		max=num;
		System.out.println("num № 1 = " + num);

		for (int i=2; i<=50; i++) {
			num = -40 + (int)( Math.random() * (40+40+1) );
			System.out.println("\nnum № " + i + " = " + num);

			if (num>max) {
				max=num;
				System.out.println("max = " + max);
			}
			
			if (num<min) {
				min=num;
				System.out.println("min = " + min);
			}
			
			if (num==0) {
				System.out.println("num = 0, невозможно определить!");
			}
			

		}
		System.out.println("\nНаибольшее из положительных max = " + max);
		System.out.println("\nНаименьшее из отрицательных min = " + min);
	}

}