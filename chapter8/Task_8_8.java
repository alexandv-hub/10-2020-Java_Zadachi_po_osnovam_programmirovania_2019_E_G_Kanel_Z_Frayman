package chapter8;

import java.util.Scanner;

/**
 Дан фрагмент класса (программный блок):
 */

public class Task_8_8 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		 System.out.println("Please input the 1st number");
		 int a = sc.nextInt();
		 System.out.println("Please input the 2nd number");
		 int b = sc.nextInt();
		 
		 int c =a/2+b/2; 
		 if (a+b != c) 
		 { 
		 c=a/2+b/2; 
		 System.out.println("C=" +c); 
		 } 
		 else 
		 { 
		 c=a%2+b%2; 
		 System.out.println("C is "+c); 
		 } 
	}
}

/**

 Заполните таблицу в соответствии с исполнением этого фрагмента:

Ввод с кла- | а | b | Значение переменной С | Вывод на экран 
виатуры     |   |   | начальное | конечное  |
5 8         | 5 | 8 |  6		| 6         |C=6
4 6         | 4 | 6 |  5        | 5         |C=5
3 7         | 3 | 7 |  4        | 4         |C=4

*/