package chapter8;

import java.util.Scanner;

/**
 Дан фрагмент класса (программный блок):
 */

public class Task_8_9 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		 System.out.println("Please input the 1st number");
		 int a = sc.nextInt();
		 int b, c;
		
		if (a%2!=1) 
		{ 
		b=a/2; 
		c=(a+b)%10; 
		System.out.println(a+b+c); 
		} 
		else 
		{ 
		b=a/2+1; 
		c=(a*b)%10; 
		System.out.println(c-a-b); 
		} 
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}

}

/**

 Заполните таблицу в соответствии с исполнением этого фрагмента:

а        | 3000   |  129   |  7    | 45    | 10    |  18   |  15   |  101  |  20   | 
b        |  1500  |   65   |   4   |  23   |  5    | 9     | 8     |  51   |  10   | 
с        |  0     |   5    |   8   |  5    |  5    |  7    |  0    | 1     | 0     |
На экран |  4500  |   -189 |   -3  |  -63  |  20   |  34   |  -23  |  -151 |   30  |

*/