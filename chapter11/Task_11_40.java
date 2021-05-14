package chapter11;

public class Task_11_40 {
	/*
	 * Напишите класс, который выводит на экран все целые положительные 
трехзначные числа, соответствующие следующему требованию: про­
изведение первой и последней цифр равно квадрату средней. 
	 */

	public static void main(String[] args) {
		
		for (int i=100; i<=999; i++) {
			int i1 = i/100;
			int i2 = i%100/10;
			int i3 = i%10;
			if ( (i1*i3) == (Math.pow(i2, 2))  )
				System.out.println(i + " ");
		}

	}

}
