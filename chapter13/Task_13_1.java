package chapter13;

import java.util.Scanner;

public class Task_13_1 {
	/*
	 * Проследите за выполнением фрагмента и запишите, какими будут 
значения переменных s1 и s2 для следующего набора вводимых дан­
ных после его окончания: 5, 12, 6, 8, 9, 7. 

   |Ввод| s1 | s2  
 1 | 5  | 0  | 0
 2 | 12 | 12 | 12
 3 | 6  | 18 | 18
 4 | 8  | 26 | 18
 5 | 9  | 26 | 27
 6 | 7  | 26 | 27
	 */
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int s1 = 0; 
		int s2 = 0; 
		for (int i=1; i<7; i++) {
			System.out.println("Введите x");
			int x = sc.nextInt(); 
			if( x%2==0)
				s1=s1+x; 
			if( x%3==0)
				s2=s2+x;
			System.out.println("s1 = "+ s1);
			System.out.println("s2 = "+ s2);
		} 

	}

}
