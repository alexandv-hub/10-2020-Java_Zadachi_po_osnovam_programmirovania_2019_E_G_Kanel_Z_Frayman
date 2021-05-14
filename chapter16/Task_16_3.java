package chapter16;

public class Task_16_3 {
	/*
С помощью таблицы трассировки проследите за выполнением фраг­
мента и запишите, что будет выведено на экран.

   | i= | j= |(j<i)= | s = s + i + j = | (Вывод)
 1 | 0  | 0  | false | 0+0+0 = 0       | 0
 2 | 0  | 1  | false |                 | 
 3 | 0  | 2  | false |                 | 
 4 | 0  | 3  | false |                 | 
 5 | 1  | 0  | true  | 0+1+0 = 1       | 1
 6 | 1  | 1  | false |                 | 
 7 | 1  | 2  | false |                 | 
 8 | 1  | 3  | false |                 | 
 9 | 2  | 0  | true  | 0+2+0 = 2       | 
 10| 2  | 1  | true  | 2+2+1 = 5       | 5
 11| 2  | 2  | false |                 |
 12| 2  | 3  | false |                 | 
 13| 3  | 0  | true  | 0+3+0 = 3       | 
 14| 3  | 1  | true  | 3+3+1 = 7       |
 15| 3  | 2  | true  | 7+3+2 = 12      | 12
 16| 3  | 3  | false |                 |

	 */

	public static void main(String[] args) {

		for (int i=0; i < 4; i++) { 
			int s=0; 
			for(int j=0; j<i ; j++) 
				s = s + i + j; 
			System.out.print (s); 
		} 

	}

}
