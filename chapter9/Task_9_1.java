package chapter9;

import java.util.Scanner;

public class Task_9_1 {
	/*
 ƒано составное условие с переменными типа int: (a>1O && b>1OO) 
1. «аполните таблицу: 
а        | 20   | 6     | 28    | 10    | 10    |
b        | 231  | 131   | 87    | 10    | 31    |
«начение | true | false | false | false | false |
выражени€

2. ƒл€ каких значений переменной а значение выражени€ всегда 
будет false?
// дл€ a<=10
	 */

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("Please input the value of a");
		int a = sc.nextInt();
		System.out.println("Please input  the value of b");
		int b = sc.nextInt();
		boolean c = (a>10 && b>100);
		System.out.println(c);
	}

}
