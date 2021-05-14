package chapter11;

import java.util.Scanner;

public class Task_11_3 {
	/*
	 * Постройте таблицу ручной прокрутки (таблицу трассировки) и укажи­
те, что будет выведено на экран, если в качестве ввода были использо­
ваны следующие значения: 27, 130, 200, 72, 89.

   |Ввод | sum | 
 1 | 27  | 0   |
 2 | 130 | 130 |
 3 | 200 | 330 |
 4 | 72  | 330 |
 5 | 89  | 330 |

	 */
 public static Scanner sc = new Scanner(System.in);
 
	public static void main(String[] args) {

		int sum=0; 
		for (int i=1; i<6; i++) // выполняется 5 раз
		{ 
		int k=sc.nextInt(); 
		if (k> 100) sum=sum+k; 
		}
		System.out.println( sum ); 
	}

}
