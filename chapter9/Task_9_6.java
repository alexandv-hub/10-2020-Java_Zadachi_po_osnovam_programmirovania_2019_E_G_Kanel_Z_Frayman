package chapter9;

import java.util.Scanner;

public class Task_9_6 {
	/*
	Напишите класс, который принимает с клавиатуры три положитель­
ных числа и проверяет, могут ли они являться длинами сторон тре­
угольника. По результатам проверки следует вывести на экран соответ­
ствующее текстовое сообщение. 
	 */
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Please input the value of a");
		int a = sc.nextInt();
		System.out.println("Please input the value of b");
		int b = sc.nextInt();
		System.out.println("Please input the value of c");
		int c = sc.nextInt();

		if ((a+b)>c && (a+c)>b && (b+c)>a) // каждая сторона треугольника больше суммы двух других его сторон
			System.out.println("Введенные числа являются длинами сторон треугольника");

		else
			System.out.println("Введенные числа не являются длинами сторон треугольника");

	}

}
