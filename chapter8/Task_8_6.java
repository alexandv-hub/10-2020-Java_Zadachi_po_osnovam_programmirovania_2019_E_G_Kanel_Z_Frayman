package chapter8;

import java.util.Scanner;

/**

 Перед вами фрагмент программы, включающий два условных опера-
тора. Заполните таблицы в соответствии с исполнением операторов.

Таблица 1
а          |  10  |  -5  |  12  |  6   |  7   |  14 |  9  |
b          |  11  |  10  |  6   |  12  |  7   |  14 |  18 |
х          | 16   | 8    | 12   | 12   | 10   | 21  | 18  |
На экране  | 16   | X=8  | X=12 | X=12 | X=10 | 21  | 18  |

Таблица 2
а          |  10 | -40   |  ?   |   6  |  7  | 0    |  9  |
b          | 21  |   10  |  ?   | -3   | ?   |  14  | 5   |
X          |  26  |  -10 |  ?   |   0  | ?   |  14  |  9  |
На экране  | 26  | X=-10 | Х=30 | Х=0  |  10 | X=14 | X=9 |

 */

public class Task_8_6 {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Please input the value of a");
		int a = sc.nextInt();
		System.out.println("Please input  the value of b");
		int b = sc.nextInt();
		int x;
		
		if (a*2!=b)
			x=a/2+b;
		else
			x=b/2+a;

		System.out.println("if (a*2!=b) x=a/2+b = " + x);
		System.out.println("else x=b/2+a = " + x);
		
		System.out.println("x = " + x); 
		if (x<15)
			System.out.println("X="+x);
		else
			System.out.println(x);

	}

}
