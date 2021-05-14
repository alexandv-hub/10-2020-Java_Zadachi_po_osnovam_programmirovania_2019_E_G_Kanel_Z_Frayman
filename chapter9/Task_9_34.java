package chapter9;

import java.util.Scanner;

public class Task_9_34 {
	/*
	 * Напишите класс, который читает с клавиатуры два символьных значе­
ния и проверяет, идентичны ли они. 
По результатам проверки следует вывести на экран соответствующее 
сообщение. 
	 */
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Введите 1-ый символ");
		String a = sc.next();
		System.out.println("Введите 2-ой символ");
		String b = sc.next();
		
		if (a.equals(b)) 
			System.out.println("Символы идентичны");
		else
			System.out.println("Символы различны");
	}

}
