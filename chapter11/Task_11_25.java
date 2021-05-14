package chapter11;

import java.util.Scanner;

public class Task_11_25 {
	/*
	 * Напишите класс, который вначале принимает с клавиатуры целое по­
ложительное число (в переменную х). Затем класс выводит на экран в 
строку все целые числа из диапазона O. .. x (включая крайние значения 
диапазона). Числа должны отделяться друг от друга знаком «пробел». 
Перед началом и после окончания вывода серии чисел на экран вывода 
следует вывести текстовые сообщения (по выбору). 
	 */
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Введите целое положительное число (в переменную х)");
		int x = sc.nextInt();
		
		System.out.println("По выбору");
		
		for (int i=0; i<=x; i++)
			System.out.print(i + " ");
		System.out.println("\nПо выбору");
	}

}
