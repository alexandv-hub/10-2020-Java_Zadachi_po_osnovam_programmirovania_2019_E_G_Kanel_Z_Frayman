package chapter9;

import java.util.Scanner;

public class Task_9_2 {
	/*
 Дано составное условие с переменными типа int: (a>10 || b>10) 
1. Заполните таблицу: 
а        | 20   | 6     | 28    | 10    | 10    |
b        | 31   | 100   | 8     | 10    | 1     |
Значение | true | true  | true  | false | false |
выражения

2. Для каких значений переменной а значение выражения всегда 
будет truе? 
	 */
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Please input the value of a");
		int a = sc.nextInt();
		System.out.println("Please input  the value of b");
		int b = sc.nextInt();
		boolean c = (a>10 || b>10);
		System.out.println(c);

	}

}
