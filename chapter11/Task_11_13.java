package chapter11;

public class Task_11_13 {
	/*
	 * Напишите класс, который выводит на экран в строку все трехзначные 
положительные числа (в убывающем порядке). Числа должны отде­
ляться друг от друга знаком «пробел». Перед началом вывода на экран 
(в отдельной строке) следует вывести слово Начало, а после окончания 
вывода чисел (тоже в отдельной строке) - слово Завершено.
	 */

	public static void main(String[] args) {
		System.out.println("Начало");
		for (int i=999; i>=100; i--) 
			System.out.print(i + " ");
		System.out.println("\nЗавершено");
	}

}