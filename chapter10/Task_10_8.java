package chapter10;

import java.util.Scanner;

public class Task_10_8 {
	/*
	 * Напишите класс, который принимает с клавиатуры целое число и затем 
генерирует («придумывает>>) случайное число из следующего диапазона: 

• «центром диапазона» является введенное с клавиатуры число; 
• количество чисел в диапазоне равно 11. 

Класс должен определять, «угадал» ли компьютер введенное число и 
выводить на экран одно из сообщений (в зависимости от соотношения 
введенного и «придуманного» чисел): 
• угадал - если числа совпали; 
• слишком большое - если «придуманное» компьютером число 
больше введенного с клавиатуры; 
• слишком маленькое - если «придуманное» компьютером число 
меньше введенного с клавиатуры. 
	 */
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Please input an integer number");
		int a = sc.nextInt();

		int up = a+11;
		int down = a-11;

		int guess = down + (int)( (up-down+1)*Math.random() ); 
		System.out.println(guess);

		if (guess == a)
			System.out.println("Угадал");
		if (guess > a)
			System.out.println("Слишком большое");
		if (guess < a)
			System.out.println("Слишком маленькое");	
	}

}
