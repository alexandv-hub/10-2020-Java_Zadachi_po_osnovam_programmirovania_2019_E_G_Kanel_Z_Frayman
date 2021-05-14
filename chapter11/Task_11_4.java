package chapter11;

import java.util.Scanner;

public class Task_11_4 {
	/*
	 * Постройте таблицу трассировки и укажите, что будет выведено на эк­
ран. Выберите значения, которые будут вводиться с клавиатуры. 

   |Ввод1 |Ввод2 |Вывод 
 1 | 27   | 28   | 28
 2 |      | 50   | 50
 3 |      | 17   |
 4 |      | 24   | 24
 
	 */
	public static Scanner sc = new Scanner(System.in);	

	public static void main(String[] args) {
		int i,x1,x2; 
		x1 =sc.nextInt(); 
		for (i=1;i<5;i++)	{ // 4 раза
			x2=sc.nextInt(); 
			if (x2>x1) System.out.println(x2); 
			x1=x2; 
		} 

	}

}
