package chapter11;

import java.util.Scanner;

public class Task_11_5 {
	/*
	 * Постройте таблицу трассировки и укажите, что будет выведено на эк­
ран, если в качестве ввода были использованы следующие значения: 2, 
1, 3, 6. 

   |Ввод  |Вывод 
 1 | 2    | 2  
 2 | 1    | 22
 3 | 3    | 222
 4 | 6    | 2226
	 */
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int k = 1; 
		int num = 0; 

		for (int i=1; i<=4; i++) { // 4 раза	
			int х = sc.nextInt(); 
			if (х % 2 ==0) num = (num*10)+х; 
			else { 
				k = k*10; 
				num = num + (2*k); 
			}
			System.out.println( num ); 
		}

	}
}
