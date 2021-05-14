package chapter9;

import java.util.Scanner;

public class Task_9_7 {
	/*
Напишите класс, который принимает с клавиатуры два числа, которые 
должны быть значениями двух углов в треугольнике. Класс должен оп­
ределять, о каком из следующих типов треугольников идет речь: ост­
роугольный, тупоугольный, прямоугольный, равнобедренный, равно­
сторонний (возможно, что треугольник относится сразу к двум типам). 

В случае если введенные с клавиатуры данные (или хотя бы одно из 
них) не могут быть углами треугольника, следует вывести на экран со­
общение Ошибочные данные.
	 */
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please input the value of a");
		int a = sc.nextInt();
		System.out.println("Please input the value of b");
		int b = sc.nextInt();
		int c = 180-a-b;

		if ((a+b)<180) {
			if (a<90 & b<90 & c<90)
				System.out.println("Треугольник остроугольный (все углы острые)");
			if (a>90 || b>90 || c>90)
				System.out.println("Треугольник тупоугольный (у которого один из углов тупой)");
			if (a==90 || b==90 || c==90)
				System.out.println("Треугольник прямоугольный");
			if (a==b || b==c || a==c)
				System.out.println("Треугольник равнобедренный");
			if (a==b & b==c)
				System.out.println("Треугольник равносторонний");
		}		
		else
			System.out.println("Ошибочные данные");

	}

}
