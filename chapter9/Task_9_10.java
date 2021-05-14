package chapter9;

import java.util.Scanner;

public class Task_9_10 {
	/*
	 * Напишите класс, который принимает с клавиатуры три целых числа и 
определяет, в каких соотношениях с точки зрения значений (равны, 
больше, меньше) они находятся. На экран следует вывести сообщение с 
точным указанием результатов проверки: например, Первое и третье 
равны, второе больше них или Все значения одинаковы. 
	 */
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please input the value of a");
		int a = sc.nextInt();
		System.out.println("Please input the value of b");
		int b = sc.nextInt();
		System.out.println("Please input the value of c");
		int c = sc.nextInt();

		if (a==b && b==c)
			System.out.println("Все значение одинаковы");
		
		if (a>b && b==c)
			System.out.println("Первое больше второго, второе и третье равны");
		
		if (a<b && b==c)
			System.out.println("Первое меньше второго, второе и третье равны");
		
		if (a>b && b>c)
			System.out.println("Первое больше второго, второе больше третьего");
		
		if (a>b && b<c)
			System.out.println("Первое больше второго, второе меньше третьего");

		if (a==c && b<c)
			System.out.println("Первое равно третьему, второе меньше третьего");
		
		if (a==c && b>c)
			System.out.println("Первое равно третьему, второе больше третьего");
		
		if (a==b && b<c)
			System.out.println("Первое и второе равны, второе меньше третьего");
		
		if (a==b && b>c)
			System.out.println("Первое и второе равны, второе больше третьего");		
	}

}
